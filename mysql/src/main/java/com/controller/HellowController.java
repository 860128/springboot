package com.controller;

import com.entity.ParamsEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author 白羊
 */
@RestController
@RequestMapping
public class HellowController {
    @Autowired
    private static Logger logger =  LoggerFactory.getLogger(HellowController.class);

    /**
     *
     * @param entity
     * @return
     */
    /**
     * 传回hello
     * @param entity
     * @return
     */

    @GetMapping("/hello")
    public String hello(ParamsEntity entity){
        logger.info("前端参数"+entity.getName());
        return "hello";
    }

    JdbcTemplate jdbcTemplate;
    @GetMapping("/query")
    public List<Map<String, Object>> queryAll() {
        String sql = "select * from user";
        System.out.println(jdbcTemplate);
//       执行sql语句
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

    //    增加用户
    @GetMapping("/addUser")
    public String addUser() {
        String sql = "insert into mybatis.user(id,name,pwd) values (5,'小明','123456')";
        jdbcTemplate.update(sql);
        return "addUser-ok";
    }

    //更新用户
    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id) {
        String sql = "update mybatis.user set name=?,pwd=? where id=" + id;
        Object[] objects = new Object[2];
        objects[0] = "小明2";
        objects[1] = "zxcv";
        jdbcTemplate.update(sql, objects);
        return "updateUser-ok";
    }

    //删除用户
    @GetMapping("/delUser/{id}")
    public String delUser(@PathVariable("id") int id) {
        String sql = "delete from user where id=?";
        jdbcTemplate.update(sql, id);
        return "delUser-ok";
    }
}
