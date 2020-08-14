package com.norman.account.service;

import com.norman.account.dto.request.AccountInfo;
import com.norman.account.repository.entity.AccountEntity;

public interface AccountService {


    /** 查找账户，手机号 */
    AccountEntity findAccountByPhoneNum(String phoneNum);
    /** 查找账户，userId */
    AccountEntity findAccountByUserId(int userId);

    /**
     * 创建账户
     * @param accountEntity 账户信息
     * @return 生成的userId
     */
    int createAccount(AccountEntity accountEntity);

    /** 更新账户，基于userId */
    void updateAccountByUserId(AccountInfo accountInfo);
    /** 更新账户，基于userId */
    void updateAccountByUserId(AccountEntity accountEntity);
}
