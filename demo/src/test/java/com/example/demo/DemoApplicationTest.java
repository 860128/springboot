package com.example.demo;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTest {
//    测试方法必须有@test；
//    该测试方法必须由public void修饰，没有返回值；
//    该方法不带任何参数；
//    新建一个源代码测试文件单独存放测试代码；
//    测试类的包和被测试类的包保持一致；
//    测试方法间互相独立没有任何依赖；
    @Test
    public void testAdd(){
        // 3 + 0
        assertEquals(2, new DemoApplication().add(3, 0));
    }

    @Test
    public void testSubtract(){
        // 6 - 3
        System.out.println(">>>>>>");
        assertEquals(3, new DemoApplication().subtract(6, 3));
    }

    @Test
    public void testMultiply(){
        // 6 * 1
        assertEquals(6, new DemoApplication().multiply(6, 1));
    }
    @Ignore
    @Test
    public void testDivision(){
        // 6 / 1
        assertEquals(6, new DemoApplication().division(6, 1));
    }
}