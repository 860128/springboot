package com.example.demo;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * All rights Reserved, Designed By www.xakrsoft.com
 *
 * @author 白羊
 * @ClassName JunitCaseTest
 * @Description: TODO
 * @date 2022-04-18 10:31
 * @Copyright: 2022 www.xakrsoft.com All rights reserved.
 */

public class JunitCaseTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("this is beforeclass");
    }

    /**
     * AfterClass修饰的方法用来对资源的清理，如关闭数据库的连接
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("this is afterclass");
    }

    /**
     * Before修饰的方法在每个test修饰的方法执行前会被执行一次，假如有两个
     * 就执行两次
     */
    @Before
    public void setUp() throws Exception {
        System.out.println("this is before");
    }

    /**
     * After修饰的方法在每个test修饰的方法执行后会被执行一次，假如有两个
     * 就执行两次
     */
    @After
    public void tearDown() throws Exception {
        System.out.println("this is after");
    }

    @Test(timeout = 1)
    public void test1() {
        System.out.println("this is test1");
//        int a = 0;
//        while(true){
//            if(a >420000000){
//                break;
//            }
//            a++;

    }

    @Test
    public void test2() {
        System.out.println("this is test2");
    }
}

