package com.norman;

import com.norman.moive.repository.IMovieDao;
import com.norman.moive.repository.IPlayAddressDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.InputStream;

public class TestMovie {


    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IMovieDao mMovieDao;
    private IPlayAddressDao mPlayAddressDao;

    @Before
    public void init() throws Exception {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
        mMovieDao = session.getMapper(IMovieDao.class);
        mPlayAddressDao = session.getMapper(IPlayAddressDao.class);
    }

    @After
    public void destroy() throws Exception {
        session.commit();
        session.close();
        in.close();
    }

//    /**
//     * 查找全部
//     */
//    @Test
//    public void testFindAll() {
//        List<Movie> movieList = mMovieDao.findAll();
//        int i = 0;
//        for (Movie movie : movieList) {
//            System.out.println(i+"++++"+movie.getName());
//            i++;
//        }
//    }
//
//    @Test
//    public void testFindByName() {
//        List<Movie> byName = mMovieDao.findByName("牙狼：红莲之月");
//        System.out.println(byName.toString());
//    }
//
//    /**
//     * 根据ID查课程
//     */
//    @Test
//    public void testFindById() {
//        Movie movie = mMovieDao.findById(1);
//        System.out.println(movie.toString());
//    }
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
//    @Test
//    public void testFindByType() {
//        List<Movie> movieList = mMovieDao.findByType("国产动漫");
//        for (Movie movie : movieList) {
//            System.out.println("++"+movie.toString());
//        }
//    }
//
//    @Test
//    public void testFindAddressByMovieId() {
//        List<PlayAddress> playAddressList = mPlayAddressDao.findByMovieId(1);
//        for (PlayAddress playAddress : playAddressList) {
//            System.out.println(playAddress.toString());
//
//        }
//    }
////    /**
////     * 根据courseID查课程
////     */
////    @Test
////    public void testFindByCourseID() {
////        List<Course> list = mCourseDao.findByCourseId(123);
////        System.out.println(list);
////    }
////
////    /**
////     * 修改课程
////     */
////    @Test
////    public void testUpdate() {
////        Course course = new Course();
////        course.setCourseId(123);
////        course.setTitle("mybatis annotation update");
////        course.setImgUrl("北京市海淀区");
////        course.setCourseProfile("男");
////        course.setTime(String.valueOf(new Date()));
////
////        mCourseDao.updateCourse(course);
////    }
////    @Test
////    public  void testFindTotal(){
////        int total = userDao.findTotalUser();
////        System.out.println(total);
////    }
//
//
////
////    @Test
////    public void testDelete(){
////        userDao.deleteUser(51);
////    }
////
//
////
////
////    @Test
////    public  void testFindByName(){
//////        List<User> users = userDao.findUserByName("%mybatis%");
////        List<User> users = userDao.findUserByName("mybatis");
////        for(User user : users){
////            System.out.println(user);
////        }
////    }
////
}
