package com.norman.account.repository;

import com.norman.mini.dto.response.MiniEntity;
import com.norman.account.repository.entity.AccountEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户信息
 */
@Repository
public interface IAccountDao {

    /**
     * 增加一条
     *
     * @param item 用户信息
     */
    @Insert("INSERT INTO account(phoneNum,userName,email,avatar," +
            "gender," +
            "password," +
            "nickname," +
            "identifier)" +
            "values(#{phoneNum},#{userName},#{email},#{avatar}" +
            ",#{gender}" +
            ",#{password}" +
            ",#{nickname}" +
            ",#{identifier})")
    // 插入数据后获取自增长的主键值,会直接赋值到实体类中，不要再赋值
    // 使用JDBC的getGenereatedKeys()方法获取主键并赋值到keyProperty设置的对象的属性中，
    //插入一条记录后，还想得到这条记录的自增主键ID，useGeneratedKeys=true就是定义数据库返回主键ID的。
    //也就是说把自增长的主键值赋值给对象相应的属性
    @Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "userId")
    void insertItem(AccountEntity item);

    /**
     * 根据userId获取查询用户信息
     */
    @Select("SELECT * FROM account where userId=#{userId} ")
    List<AccountEntity> findByUserId(int userId);
    /**
     * 根据username获取查询用户信息
     */
    @Select("SELECT * FROM account where username=#{username} ")
    List<AccountEntity> findByUsername(String username);
    /**
     * 根据 phoneNum 获取查询用户信息
     */
    @Select("SELECT * FROM account where phoneNum=#{phoneNum} ")
    List<AccountEntity> findByphoneNum(String phoneNum);

    /**
     * 根据userId，更新token
     */
    @Update("update account set phoneNum=#{phoneNum}," +
            "userName=#{userName}," +
            "password=#{password}," +
            "nickname=#{nickname}," +
            "email=#{email}," +
            "avatar=#{avatar}," +
            "gender=#{gender}," +
            "identifier=#{identifier} where userId=#{userId}")
    void updateByUserId(AccountEntity token);
    /**
     * 获取all
     */
    @Select("SELECT * FROM haokan")
    List<MiniEntity> getAll();


    //    @Insert("insert into mini(" +
//            "HW," +
//            "mode," +
//            "miniLandPoster)" +
//            "values(" +
//            "#{HW}," +
//            "#{mode}," +
//            "#{miniLandPoster})")

    //
//    /**
//     * 根据名称修改影片
//     */
//    @Update("update movie set name=#{name},title_tip=#{title_tip}" +
//            ",type=#{type},tag=#{tag},cover_url=#{cover_url},score=#{score},score_total=#{score_total}" +
//            ",score_num=#{score_num},alias=#{alias},director=#{director},actors=#{actors}," +
//            "language=#{language},region=#{region},release_time=#{release_time},length=#{length},update_time=#{update_time}," +
//            "views_total=#{views_total},views_today=#{views_today},summary=#{summary} where name=#{name}")
//    void updateMovie(Movie movie);
//
//    /**
//     * 查询所有视频
//     */
//    @Select("select * from movie")
//    List<Movie> findAll();
//
//    /**
//     * 根据影片名称查询影片
//     */
//    @Select("select * from movie  where name=#{name} ")
////    @ResultMap("movieMap")
//    List<Movie> findByName(String name);
//
//
//    /**
//     * 根据类别查询影片
//     * 国产动漫
//     * 日韩动漫
//     * 欧美动漫
//     * 港台动漫
//     * 海外动漫
//     */
//    @Select("select * from movie where type=#{type}")
//    List<Movie> findByType(String type);
}
