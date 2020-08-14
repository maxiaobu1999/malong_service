package com.norman.mini.service.impl;

import com.norman.mini.MiniManager;
import com.norman.mini.repository.IMiniDao;
import com.norman.mini.dto.response.MiniEntity;
import com.norman.mini.service.MiniService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Primary // 解决 expected single matching bean but found 2: accountServiceImpl,accountService
@Service
public class MiniServiceImpl implements MiniService {
    @Resource
    private IMiniDao mMiniDao;


    @Override
    public List<MiniEntity> queryByNum(String num) {
        int i = Integer.parseInt(num);
        List<MiniEntity> miniList = mMiniDao.findByNum(i);
        MiniManager manager = new MiniManager();
        manager.conversionMedia(miniList);
        return miniList;
    }
}
