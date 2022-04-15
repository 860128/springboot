package com.bpuns;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * All rights Reserved, Designed By www.xakrsoft.com
 *
 * @author 白羊
 * @ClassName HelloWorld
 * @Description: TODO
 * @date 2022-04-14 17:46
 * @Copyright: 2022 www.xakrsoft.com All rights reserved.
 */

public class HelloWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse rep){
        try{
            PrintWriter pW = rep.getWriter();
            pW.println("nmsl");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
