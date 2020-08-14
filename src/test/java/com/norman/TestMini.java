package com.norman;

import com.norman.tik.repository.ITikDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.InputStream;

public class TestMini {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private ITikDao mMiniDao;
//    private IPlayAddressDao mPlayAddressDao;

    @Before
    public void init() throws Exception {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
        mMiniDao = session.getMapper(ITikDao.class);
//        mPlayAddressDao = session.getMapper(IPlayAddressDao.class);
    }

    @After
    public void destroy() throws Exception {
        session.commit();
        session.close();
        in.close();
    }


//    /**
//     * 根据ID查课程
//     */
//    @Test
//    public void testFindById() {
//        DYVideoItem dy = mMiniDao.findById(1);
//        System.out.println(dy.toString());
//    }
//    /** 随机查询n条 */
//    @Test
//    public void testFindByNum() {
////        int num = 20;
////        int min = 1;
////        int max = 2580;
////        while (num > 0) {
////            int i=  min + (int)(Math.random() * (max-min+1));
////            DYVideoItem dy = mMiniDao.findById(i);
////            System.out.println(dy.toString());
////            num--;
////        }
//        List<TikEntity> byNum = mMiniDao.findByNum(10);
//                    System.out.println(byNum.get(1).toString());
//
//    }


}
