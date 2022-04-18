package com.example.demo;

/**
 * All rights Reserved, Designed By www.xakrsoft.com
 *
 * @author 白羊
 * @ClassName CustomerService
 * @Description: TODO
 * @date 2022-04-18 11:14
 * @Copyright: 2022 www.xakrsoft.com All rights reserved.
 */

public class CustomerService {
    public Customer findByName(String name) throws NameNotFoundException {
        if ("".equals(name)) {
            // 模拟异常场景
            throw new NameNotFoundException(666, "Name is empty!");
        }
        return new Customer(name);
    }

    static class Customer{
        private String name;

        public Customer(String name) {
            super();
            this.name = name;
        }
    }
}
