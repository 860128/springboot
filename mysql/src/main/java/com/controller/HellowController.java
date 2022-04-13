package com.controller;

import com.entity.ParamsEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 白羊
 */
@RestController
@RequestMapping
public class HellowController {

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
    @RequestMapping("/hello")
    public String hello(ParamsEntity entity){
        logger.info("前端参数"+entity.getName());
        return "hello";
    }
}
