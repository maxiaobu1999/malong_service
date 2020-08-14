package com.norman.account.service.impl;

import com.norman.account.dto.request.AccountInfo;
import com.norman.account.repository.IAccountDao;
import com.norman.account.repository.entity.AccountEntity;
import com.norman.account.service.AccountService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
@Primary // 解决 expected single matching bean but found 2: accountServiceImpl,accountService
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private IAccountDao mAccountDao;

    @Override
    public AccountEntity findAccountByPhoneNum(String phoneNum) {
        List<AccountEntity> accounts = mAccountDao.findByphoneNum(phoneNum);
        if (accounts != null && accounts.size() > 0) {
            return accounts.get(0);
        }
        return null;
    }

    @Override
    public AccountEntity findAccountByUserId(int userId) {
        List<AccountEntity> accounts = mAccountDao.findByUserId(userId);
        if (accounts != null && accounts.size() > 0) {
            return accounts.get(0);
        }
        return null;
    }

    @Override
    public int createAccount(AccountEntity accountEntity) {
        mAccountDao.insertItem(accountEntity);
        return accountEntity.getUserId();
    }

    @Override
    public void updateAccountByUserId(AccountInfo accountInfo) {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setUserId(accountInfo.userId);
        if (!StringUtils.isEmpty(accountInfo.getPhoneNum())) {
            accountEntity.setPhoneNum(accountInfo.getPhoneNum());
        }
        if (!StringUtils.isEmpty(accountInfo.getPassword())) {
            accountEntity.setPassword(accountInfo.getPassword());
        }
        if (!StringUtils.isEmpty(accountInfo.getUserName())) {
            accountEntity.setUserName(accountInfo.getUserName());
        }
        if (!StringUtils.isEmpty(accountInfo.getEmail())) {
            accountEntity.setEmail(accountInfo.getEmail());
        }
        if (!StringUtils.isEmpty(accountInfo.getAvatar())) {
            accountEntity.setAvatar(accountInfo.getAvatar());
        }
        if (!StringUtils.isEmpty(accountInfo.getGender())) {
            accountEntity.setGender(accountInfo.getGender());
        }
        if (!StringUtils.isEmpty(accountInfo.getNickname())) {
            accountEntity.setNickname(accountInfo.getNickname());
        }
        if (!StringUtils.isEmpty(accountInfo.getIdentifier())) {
            accountEntity.setIdentifier(accountInfo.getIdentifier());
        }

        mAccountDao.updateByUserId(accountEntity);
    }

    @Override
    public void updateAccountByUserId(AccountEntity accountEntity) {
        mAccountDao.updateByUserId(accountEntity);
    }
}
