package com.example.demo;

/**
 * All rights Reserved, Designed By www.xakrsoft.com
 *
 * @author 白羊
 * @ClassName Exception3Test
 * @Description: TODO
 * @date 2022-04-18 11:13
 * @Copyright: 2022 www.xakrsoft.com All rights reserved.
 */

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.naming.NameNotFoundException;

public class Exception3Test {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testDivisionWithException() {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(containsString("/ by zero"));
        int i = 1 / 0;
    }

    @Test
    public void testNameNotFoundException() throws NameNotFoundException {
        //test type
        thrown.expect(NameNotFoundException.class);

        //test message
        thrown.expectMessage(is("Name is empty!"));

        //test detail
        thrown.expect(hasProperty("errCode"));  //make sure getters n setters are defined.
        thrown.expect(hasProperty("errCode", is(666)));

        CustomerService cust = new CustomerService();
        //cust.findByName("");
    }

}
