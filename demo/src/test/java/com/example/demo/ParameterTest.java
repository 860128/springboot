package com.example.demo;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
    //声明变量存放预期值和测试数据；
    int expected=0;
    int input1=0;
    int input2=0;
    int a=0;
    @Parameters//从里面取参数
    public static Collection<Object[]> test(){

        return Arrays.asList(new Object[][]{
                {3,1,2,2},
                {4,2,2,2},
                {1,2,3,2}
        });
    }

    public ParameterTest(int expected,int input1,int input2,int a){
        this.expected=expected;
        this.input1=input1;
        this.input2=input2;
        this.a = a;
    }
    @Test
    public void testAdd(){
        assertEquals(expected, new DemoApplication().add(input1, input2));
    }
    @Test(expected = ArithmeticException.class)//如果方法产生一个ArithmeticException的异常，则表示测试通过
    public void testDivisionWithException() {
        int i = 1 / 1;
    }
    /**
     * 运行时抛出一个IndexOutOfBoundsException异常才会测试通过
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testEmptyList() {
        new ArrayList<>().get(0);
    }

}
