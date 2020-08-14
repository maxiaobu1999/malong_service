package com.norman.account.service.impl;

import com.norman.account.service.SmsCodeService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary // 解决 expected single matching bean but found 2: accountServiceImpl,accountService
@Service
public class SmsCodeServiceImpl implements SmsCodeService {
    @Override
    public int getSmsCode(String phoneNum) {
        return 1234;
    }

    @Override
    public boolean verifySmsCode(String phoneNum, int code) {
        if (code == 1234) {
            return true;
        }
        return false;
    }
}
