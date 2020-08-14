package com.norman.account.controller;

import com.norman.account.dto.request.AccountInfo;
import com.norman.account.repository.entity.AccountEntity;
import com.norman.account.service.AccountService;
import com.norman.account.service.SmsCodeService;
import com.norman.common.BaseResponse;
import com.norman.common.TokenManager;
import com.norman.common.controller.BaseController;
import com.norman.config.annotation.SkipTokenValidate;
import com.norman.utils.Utils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.http.util.TextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController // 相当于@ResponseBody和@Controller
@RequestMapping(value = "/account")// 配置url映射,一级
@SuppressWarnings("Duplicates") // 去除代码重复警告
public class AccountController extends BaseController {
    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Resource
    private TokenManager mTokenManager;
    @Resource
    private SmsCodeService mSmsCodeService;
    @Resource
    private AccountService mAccountService;

    /**
     * 获取验证码
     * http://localhost:8088/account/smsCode?phoneNum=15652814311
     *
     * @param phoneNum 手机号码
     */
    @SkipTokenValidate
    @ApiOperation(value = "验证码", notes = "获取验证码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phoneNum", value = "手机号", required = true, paramType = "query", dataType = "String", defaultValue = "15652814311"),
    })
    @RequestMapping(value = {"/smsCode"}, method = {RequestMethod.GET})// 配置url映射,二级
    public BaseResponse<String> smsCode(@RequestParam String phoneNum) {
        BaseResponse<String> responseEntity;
        if (!Utils.isPhone(phoneNum)) {
            responseEntity = new BaseResponse<>(-1, "手机号码填写错误");
            return responseEntity;
        }
        int smsCode = mSmsCodeService.getSmsCode(phoneNum);
        responseEntity = new BaseResponse<>(0,
                "没找到便宜的验证码平台,1234凑活用吧");
        responseEntity.setData(String.valueOf(smsCode));
        return responseEntity;
    }

    /**
     * 手机号码注册
     * <p>
     * http://localhost:8088/account/register/mobile?phoneNum=15652814311&password=123456&code=1234
     *
     * @param phoneNum 手机号码
     * @param password 密码
     * @param code     验证码
     * @return token
     */
    @SkipTokenValidate
    @ApiOperation(value = "注册", notes = "手机号码注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phoneNum", value = "手机号", required = true, paramType = "query", dataType = "String", defaultValue = "15652814311"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query", dataType = "String", defaultValue = "123456"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, paramType = "query", dataType = "String", defaultValue = "1234"),
    })
    @RequestMapping(value = {"/register/mobile"}, method = {RequestMethod.POST,RequestMethod.GET})
    public BaseResponse<AccountEntity> mobileRegister(
            @RequestParam String phoneNum, @RequestParam String password, @RequestParam String code) {
        logger.info("mobileRegister#{\"url\":{}, \"method\":{}}", "/account", RequestMethod.POST);
        BaseResponse<AccountEntity> responseEntity;
        try {
            if (!Utils.isPhone(phoneNum)) {
                responseEntity = new BaseResponse<>(1, "请输入正确手机号码");
                return responseEntity;
            }
            if (TextUtils.isEmpty(password)) {
                responseEntity = new BaseResponse<>(1, "密码是null的");
                return responseEntity;
            }
            if (TextUtils.isEmpty(code)) {
                responseEntity = new BaseResponse<>(1, "没填验证码");
                return responseEntity;
            }
            if (!code.equals("1234")) {
                responseEntity = new BaseResponse<>(1, "验证码填写错误，填1234");
                return responseEntity;
            }

            if (mAccountService.findAccountByPhoneNum(phoneNum) != null) {
                responseEntity = new BaseResponse<>(1, "手机号已存在");
                return responseEntity;
            }
            AccountEntity accountEntity = new AccountEntity();
            accountEntity.setPhoneNum(Long.parseLong(phoneNum));
            accountEntity.setPassword(password);
            // 插入后，返回userId
            int userId = mAccountService.createAccount(accountEntity);
            // 生成token
            String token = mTokenManager.generateToken(userId);
            // 返回数据
            responseEntity = new BaseResponse<>(0, "注册成功", token);
            accountEntity.setPassword("");// 不返回密码
            responseEntity.setData(accountEntity);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new BaseResponse<>(-1, "注册失败，为啥不知道");
        }
        return responseEntity;
    }


    /**
     * 手机登录
     * http://localhost:8088/account/login/mobile?phoneNum=1514311&password=1234
     *
     * @param phoneNum 手机号
     * @param password 密码
     * @return token
     */
    @SkipTokenValidate
    @ApiOperation(value = "登录", notes = "手机登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phoneNum", value = "手机号", required = true, paramType = "query", dataType = "String", defaultValue = "15652814311"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query", dataType = "String", defaultValue = "123456"),
    })
    @RequestMapping(value = {"/login/mobile"}, method = {RequestMethod.POST,RequestMethod.GET})
    @SuppressWarnings("Duplicates")
    public BaseResponse<AccountEntity> mobileLogin(@RequestParam String phoneNum, @RequestParam String password) {
        BaseResponse<AccountEntity> responseEntity;
        try {
            if (!Utils.isPhone(phoneNum)) {
                responseEntity = new BaseResponse<>(1, "请输入正确手机号码");
                return responseEntity;
            }
            if (TextUtils.isEmpty(password)) {
                responseEntity = new BaseResponse<>(1, "密码是null的");
                return responseEntity;
            }

            AccountEntity accountEntity = mAccountService.findAccountByPhoneNum(phoneNum);
            if (accountEntity == null) {
                responseEntity = new BaseResponse<>(1, "手机号码不存在或密码错误（手机号码）");
                return responseEntity;
            }
            if (!password.equals(accountEntity.getPassword())) {
                responseEntity = new BaseResponse<>(1, "用户名不存在或密码错误（密码）");
                return responseEntity;
            }
            // 查userId
            int userId = accountEntity.getUserId();
            // 更新的token
            String token = mTokenManager.generateToken(userId);
            responseEntity = new BaseResponse<>(0, "登录成功", token);
            responseEntity.setData(accountEntity);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new BaseResponse<>(-1, "登录失败，为啥不知道");
        }
        return responseEntity;
    }


    /**
     * 修改密码，手机号
     * <p>
     * http://localhost:8088/account/modifyPassword/mobile?phoneNum=15652814311&password=asdf&code=1234
     *
     * @param phoneNum 手机号
     * @param password 新的密码
     * @param code     验证码
     */
    @SkipTokenValidate
    @ApiOperation(value = "修改密码", notes = "修改密码，手机号")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phoneNum", value = "手机号", required = true, paramType = "query", dataType = "String", defaultValue = "15652814311"),
            @ApiImplicitParam(name = "password", value = "新的密码", required = true, paramType = "query", dataType = "String", defaultValue = "123456"),
            @ApiImplicitParam(name = "code", value = "验证码", required = true, paramType = "query", dataType = "String", defaultValue = "1234"),
    })
    @RequestMapping(value = {"/modifyPassword/mobile"}, method = RequestMethod.POST)
    public BaseResponse<String> mobileModifyPassword(@RequestParam String phoneNum
            , @RequestParam String password, @RequestParam String code) {
        BaseResponse<String> responseEntity;
        try {
            if (!Utils.isPhone(phoneNum)) {
                responseEntity = new BaseResponse<>(1, "请输入正确的手机号码");
                return responseEntity;
            }
            if (TextUtils.isEmpty(password)) {
                responseEntity = new BaseResponse<>(1, "密码是null的");
                return responseEntity;
            }
            if (TextUtils.isEmpty(code)) {
                responseEntity = new BaseResponse<>(1, "验证码是null的");
                return responseEntity;
            }
            AccountEntity accountEntity = mAccountService.findAccountByPhoneNum(phoneNum);
            if (accountEntity == null) {
                responseEntity = new BaseResponse<>(1, "手机号码没注册过");
                return responseEntity;
            }
            // 修改密码
            accountEntity.setPassword(password);
            mAccountService.updateAccountByUserId(accountEntity);
            responseEntity = new BaseResponse<>(0, "修改密码成功");
            responseEntity.setData("");
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new BaseResponse<>(-1, "修改密码失败，为啥不知道");
        }
        return responseEntity;
    }

    /**
     * 修改用户信息
     * <p>
     * http://localhost:8088/account/account?token=308328080
     *
     * @return 用户信息
     */
    @ApiOperation(value = "查询用户信息", notes = "查询用户信息，token")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户ID", required = true, paramType = "query", dataType = "String", defaultValue = "1"),
            @ApiImplicitParam(name = "token", value = "token", required = true, paramType = "query", dataType = "String", defaultValue = "308328080"),
    })
    @RequestMapping(value = {"/account"}, method = {RequestMethod.GET}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public BaseResponse<AccountEntity> account(@RequestParam String token, @RequestParam int userId) {
        logger.info("QueryUser#{\"url\":{}, \"method\":{}, \"token\":{}}", "/account/queryUser", RequestMethod.GET, token);
        BaseResponse<AccountEntity> responseEntity;
        try {
            // 查询用户信息
            AccountEntity accountEntity = mAccountService.findAccountByUserId(userId);
            responseEntity = new BaseResponse<>(0, "获取用户信息成功");
            responseEntity.setData(accountEntity);
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new BaseResponse<>(-1, "获取用户信息，为啥不知道");
        }
        return responseEntity;
    }

    /**
     * 修改用户信息
     * <p>
     * <p>
     * http://localhost:8088/account/updateUserInfo?token=1490600326&accountNew="{ \"userId\": \"\", \"phoneNum\": 0, \"userName\": \"1514311\", \"password\": \"123\", \"email\": null, \"avatar\": null, \"gender\": null, \"identifier\": null }"
     *
     * @param accountNew 用户信息的json
     */
//    @AutoValidate // 参数校验
    @ApiOperation(value = "修改用户信息", notes = "修改用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "accountNew", value = "用户信息", required = true, paramType = "body",
                    dataType = "AccountInfo"),
            @ApiImplicitParam(name = "userId", value = "用户ID", required = true, paramType = "query", dataType = "String", defaultValue = "1"),
            @ApiImplicitParam(name = "token", value = "token", required = true, paramType = "query", dataType = "String", defaultValue = "671688988"),
    })
    @RequestMapping(value = {"/updateUserInfo"}, method = {RequestMethod.POST}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public BaseResponse<String> updateUserInfo(@RequestBody AccountInfo accountNew, @RequestParam int userId) {
        BaseResponse<String> responseEntity;
        try {
            // 修改用户信息，但是userId不能变
            accountNew.setUserId(userId);
            mAccountService.updateAccountByUserId(accountNew);
            responseEntity = new BaseResponse<>(0, "修改用户信息成功");
            responseEntity.setData("");
        } catch (Exception e) {
            e.printStackTrace();
            responseEntity = new BaseResponse<>(-1, "修改用户信息失败，为啥不知道");
        }
        return responseEntity;
    }

    //    /**
//     * 注册
//     * http://localhost:8088/account/registerByUsername?username=15652814311&password=1234
//     *
//     * @param username 用户名
//     * @param password 密码
//     * @return token
//     */
//    @SuppressWarnings("Duplicates")
//    @RequestMapping("/registerByUsername")
//    public BaseFeedResponse<String> registerByUsername(String username, String password) {
//        BaseFeedResponse<String> responseEntity;
//        try {
//            if (TextUtils.isEmpty(username)) {
//                responseEntity = new BaseFeedResponse<>(1, "用户名是null的");
//                return responseEntity;
//            }
//            if (TextUtils.isEmpty(password)) {
//                responseEntity = new BaseFeedResponse<>(1, "密码是null的");
//                return responseEntity;
//            }
//            List<AccountEntity> accounts = mAccountDao.findByUsername(username);
//            if (accounts.size() > 0) {
//                responseEntity = new BaseFeedResponse<>(1, "用户名已存在");
//                return responseEntity;
//            }
//            // 插入用户信息
//            AccountEntity accountEntity = new AccountEntity();
//            accountEntity.setUserName(username);
//            accountEntity.setPassword(password);
//            mAccountDao.insertItem(accountEntity);
//            // 查询userId
//            accounts = mAccountDao.findByUsername(username);
//            String userId = accounts.get(0).getUserId();
//            // 插入token
//            TokenEntity tokenEntity = new TokenEntity();
//            tokenEntity.setUserId(userId);
//            tokenEntity.setToken(createToken());
//            tokenEntity.setLoginTime(System.currentTimeMillis());
//            mTokenDao.insertItem(tokenEntity);
//            // 返回数据
//            responseEntity = new BaseFeedResponse<>(0, "注册成功", tokenEntity.getToken());
//            responseEntity.setData(null);
//        } catch (Exception e) {
//            e.printStackTrace();
//            responseEntity = new BaseFeedResponse<>(-1, "注册失败，为啥不知道");
//        }
//        return responseEntity;
//    }
//    /**
//     * 账户登录
//     * http://localhost:8088/account/loginByUsername?username=1514311&password=1234
//     *
//     * @param username 用户名
//     * @param password 密码
//     * @return token
//     */
//    @SuppressWarnings("Duplicates")
//    @RequestMapping("/loginByUsername")
//    public BaseFeedResponse<String> loginByUsername(String username, String password) {
//        BaseFeedResponse<String> responseEntity;
//        try {
//            if (TextUtils.isEmpty(username)) {
//                responseEntity = new BaseFeedResponse<>(1, "用户名是null的");
//                return responseEntity;
//            }
//            if (TextUtils.isEmpty(password)) {
//                responseEntity = new BaseFeedResponse<>(1, "密码是null的");
//                return responseEntity;
//            }
//            List<AccountEntity> accounts = mAccountDao.findByUsername(username);
//            if (accounts.size() == 0) {
//                responseEntity = new BaseFeedResponse<>(1, "用户名不存在或密码错误（用户名）");
//                return responseEntity;
//            }
//            AccountEntity accountEntity = accounts.get(0);
//            if (!password.equals(accountEntity.getPassword())) {
//                responseEntity = new BaseFeedResponse<>(1, "用户名不存在或密码错误（密码）");
//                return responseEntity;
//            }
//            // 查userId
//            String userId = accountEntity.getUserId();
//            // 更新的token
//            TokenEntity tokenEntity = updateToken(userId);
//            responseEntity = new BaseFeedResponse<>(0, "登录成功", tokenEntity.getToken());
//            responseEntity.setData("");
//        } catch (Exception e) {
//            e.printStackTrace();
//            responseEntity = new BaseFeedResponse<>(-1, "登录失败，为啥不知道");
//        }
//        return responseEntity;
//    }

//    /**
//     * 修改密码
//     * http://localhost:8088/account/modifyPasswordByUsername?username=15652814311&passwordOld=1234&passwordNew=123
//     *
//     * @param username    用户名
//     * @param passwordOld 旧密码
//     * @param passwordNew 新密码
//     * @return token
//     */
//    @SuppressWarnings("Duplicates")
//    @RequestMapping("/modifyPasswordByUsername")
//    public BaseFeedResponse<String> modifyPasswordByUsername(String username, String passwordOld, String passwordNew) {
//        BaseFeedResponse<String> responseEntity;
//        try {
//            if (TextUtils.isEmpty(username)) {
//                responseEntity = new BaseFeedResponse<>(1, "用户名是null的");
//                return responseEntity;
//            }
//            if (TextUtils.isEmpty(passwordOld)) {
//                responseEntity = new BaseFeedResponse<>(1, "旧密码是null的");
//                return responseEntity;
//            }
//            if (TextUtils.isEmpty(passwordNew)) {
//                responseEntity = new BaseFeedResponse<>(1, "新密码是null的");
//                return responseEntity;
//            }
//            List<AccountEntity> accounts = mAccountDao.findByUsername(username);
//            if (accounts.size() == 0) {
//                responseEntity = new BaseFeedResponse<>(1, "用户名不存在或密码错误（用户名null）");
//                return responseEntity;
//            }
//            AccountEntity accountEntity = accounts.get(0);
//            if (!passwordOld.equals(accountEntity.getPassword())) {
//                responseEntity = new BaseFeedResponse<>(1, "用户名不存在或密码错误（密码）");
//                return responseEntity;
//            }
//            // 修改密码
//            accountEntity.setPassword(passwordNew);
//            mAccountDao.updateByUserId(accountEntity);
//            responseEntity = new BaseFeedResponse<>(0, "修改密码成功");
//            responseEntity.setData("");
//        } catch (Exception e) {
//            e.printStackTrace();
//            responseEntity = new BaseFeedResponse<>(-1, "修改密码失败，为啥不知道");
//        }
//        return responseEntity;
//    }


}
