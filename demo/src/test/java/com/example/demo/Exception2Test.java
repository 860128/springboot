package com.example.demo;

import java.util.ArrayList;
import org.junit.Test;
//注意：这是java中的静态引入
import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Exception2Test {
    @Test
    public void testDivisionWithException() {
        try {
            int i = 1 / 0;
            fail();
        } catch (ArithmeticException e) {
            assertThat(e.getMessage(), is("/ by zero"));
        }
    }

    @Test
    public void testEmptyList() {
        try {
            new ArrayList<>().get(0);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), is("Index: 0, Size: 0"));
        }
    }
}
