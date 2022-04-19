package com.xakr.mybatis.mapper;

import com.xakr.controller.applyCompany.params.ApplyCompanyParam;
import com.xakr.mybatis.model.ApplyCompany;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplyCompanyMapperTest {
    @Autowired(required = false)
    ApplyCompanyMapper applyCompanyMapper;
    @Autowired
    DataSource dataSource;
    @org.junit.Test
  public  void loadApplyCompanyListCount() throws IOException, SQLException {
//        System.out.println(("----- selectAll method test ------"));
//        List<ApplyCompany> userList = applyCompanyMapper.selectList(null);
//        System.out.println(userList);
//        Assert.assertEquals(1, userList.size());
//        userList.forEach(System.out::println);
        /**
         * 用于执行loadApplyCompanyListCount接口
         */
        //两个一致映射文件的namespace要与mapper接口的全类名一致
        //sql的id要与mapper接口一致
        InputStream is = Resources.getResourceAsStream("application.yml");
        //读取配置文件，获取字节输入流,这个文档有问题,本来应该用mybatis.xml但是springboot直接省略了，第11
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession =  sqlSessionFactory.openSession();
        //sqlSession代表java和数据库的对话， 三大将
        ApplyCompanyMapper mapper = sqlSession.getMapper( ApplyCompanyMapper.class);
        //getMapper创建了传入的类和接口的实现对象
        //测试功能
        ApplyCompanyParam param = new ApplyCompanyParam();
       int result = mapper.loadApplyCompanyListCount(param);
        //执行语句后提交事务， sqlSessionFactory.openSession(true);可以得到自动提交，但要下载源码
        sqlSession.commit();
       System.out.println("result:"+result);


    }

    @Test
  public  void loadApplyCompanyList() {
    }
}