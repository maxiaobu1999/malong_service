package com.norman.moive.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.norman.moive.repository.IMovieDao;
import com.norman.moive.repository.IPlayAddressDao;
import com.norman.moive.dto.response.Movie;
import com.norman.moive.dto.response.PlayAddress;
import com.norman.moive.dto.response.TypeEntity;
import com.norman.moive.service.MovieService;
import org.apache.http.util.TextUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Primary // 解决 expected single matching bean but found 2: accountServiceImpl,accountService
@Service
public class MovieServiceImpl implements MovieService {
    @Resource
    private IMovieDao mMovieDao;
    @Resource
    private IPlayAddressDao mPlayAddressDao;


    @Override
    public Movie queryByName(String name) {
        List<Movie> movieList = mMovieDao.findByName(name);
        if (movieList.size() == 0) {
            return null;
        } else {
            return movieList.get(0);
        }
    }

    @Override
    public List<Movie> queryByType(String type) {
        List<Movie> movieList = mMovieDao.findByType(type);
        for (Movie movie : movieList) {
            List<PlayAddress> playAddressList = mPlayAddressDao.findByMovieId(movie.getId());
            movie.setPlayAddresses(playAddressList);
        }
        return movieList;
    }
    @Override
    public List<Movie> queryByNum(int num) {
        List<Movie> movieList = mMovieDao.findByNum(num);
        for (Movie movie : movieList) {
            List<PlayAddress> playAddressList = mPlayAddressDao.findByMovieId(movie.getId());
            movie.setPlayAddresses(playAddressList);
        }
        return movieList;
    }

    @Override
    public List<TypeEntity> queryFilter() {
        String movie_type = "[\n" +
                "    {\n" +
                "        \"title\": \"自定义\",\n" +
                "        \"index\": \"0\",\n" +
                "        \"content\": [\n" +
                "            \"热播榜\",\n" +
                "            \"新上线\",\n" +
                "            \"好评榜\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"title\": \"类型\",\n" +
                "        \"index\": \"0\",\n" +
                "        \"content\": [\n" +
                "            \"全部\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"title\": \"地区\",\n" +
                "        \"index\": \"0\",\n" +
                "        \"content\": [\n" +
                "            \"全部\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"title\": \"年份\",\n" +
                "        \"index\": \"0\",\n" +
                "        \"content\": [\n" +
                "            \"全部\",\n" +
                "            \"2019\",\n" +
                "            \"2018\",\n" +
                "            \"2017\",\n" +
                "            \"2016\",\n" +
                "            \"2015\",\n" +
                "            \"2014\",\n" +
                "            \"2013\",\n" +
                "            \"2012\",\n" +
                "            \"2011\",\n" +
                "            \"2010\",\n" +
                "            \"2009\",\n" +
                "            \"2008\",\n" +
                "            \"2007\",\n" +
                "            \"2006\",\n" +
                "            \"2005\",\n" +
                "            \"2004\",\n" +
                "            \"2003\",\n" +
                "            \"2002\",\n" +
                "            \"2001\",\n" +
                "            \"2000\",\n" +
                "            \"1999\"\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"title\": \"语言\",\n" +
                "        \"index\": \"0\",\n" +
                "        \"content\": [\n" +
                "            \"全部\"\n" +
                "        ]\n" +
                "    }\n" +
                "]";
        Gson gson = new Gson();
        List<TypeEntity> typeEntityList = gson.fromJson(movie_type, new TypeToken<List<TypeEntity>>() {
        }.getType());
        // 电影类型
        TypeEntity movieTypeEntity = typeEntityList.get(1);
        List<String> movieTypeList = mMovieDao.queryAllType();
        movieTypeEntity.getContent().addAll(movieTypeList);
        // 地区 region
        TypeEntity movieRegionEntity = typeEntityList.get(2);
        List<String> movieRegionList = mMovieDao.queryAllRegion();
        movieRegionEntity.getContent().addAll(movieRegionList);
        // 语言
        TypeEntity movieLanguageEntity = typeEntityList.get(4);
        List<String> movieLanguageList = mMovieDao.queryAllLanguage();
        movieLanguageEntity.getContent().addAll(movieLanguageList);
        return typeEntityList;
    }

    @Override
    public List<Movie> findByFilter(String custom, String type, String region, String time, String language, int start, int pageSize) {
        List<Movie> movieList = mMovieDao.findByFilter(custom, type, region, time, language, start, pageSize);
        for (Movie movie : movieList) {
            List<PlayAddress> playAddressList = mPlayAddressDao.findByMovieId(movie.getId());
            movie.setPlayAddresses(playAddressList);
        }
        if (!TextUtils.isEmpty(custom)) {
            if (custom.equals("新上线")) {
                // 根据更新事件排序
                movieList.sort((o1, o2) -> (int) (o1.getUpdate_time()-o2.getUpdate_time()));
            } else if (custom.equals("好评榜")) {
                movieList.sort((o1,o2)-> (int) (o1.getScore()-o2.getScore()));
            }
        }
        return movieList;
    }


}
