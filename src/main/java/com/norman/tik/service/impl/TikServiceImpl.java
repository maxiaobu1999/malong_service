package com.norman.tik.service.impl;

import com.norman.tik.TikManager;
import com.norman.tik.repository.ITikDao;
import com.norman.tik.dto.response.TikEntity;
import com.norman.tik.service.TikService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Primary // 解决 expected single matching bean but found 2: accountServiceImpl,accountService
@Service
public class TikServiceImpl implements TikService {
    @Resource
    private ITikDao mMiniDao;

    @Override
    public List<TikEntity> queryByNum(int num) {
        List<TikEntity> miniList = mMiniDao.findByNum(num);
        TikManager tikManager = new TikManager();
        tikManager.conversionMedia(miniList);
        return miniList;
    }
}
