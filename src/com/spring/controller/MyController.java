package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.annitation.infaceter.ReturnJson;
import com.spring.annitation.infaceter.ReturnJsp;
import com.spring.server.MyServer;

/**
 *
 * @author ykzhu
 */

@Controller
public class MyController {
    @Autowired
    private MyServer myServer;

    @ResponseBody
    @RequestMapping(value = "/returnValue.action")
    @ReturnJson
    public Object returnValue( HttpServletRequest request, HttpServletResponse response ) {
        // List<Map<String, Object>> list = myServer.getSever();
        return "{'a':'c'}";
    }

    @RequestMapping(value = "/returnJsp.action")
    @ReturnJsp
    public String returnJsp( HttpServletRequest request, HttpServletResponse response ) {
        //String path = request.getRequestURI() + "";
        return "";
    }
}
