package com.spring.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO: 处理Xss漏洞
 * 
 * @author ykzhu
 */
public class XssFilter2 implements HandlerInterceptor {
    private String mappingURL;// 利用正则映射到需要拦截的路径

    public void setMappingURL( String mappingURL ) {
        this.mappingURL = mappingURL;
    }

    // 请求执行方法之前执行
    @Override
    public boolean preHandle( HttpServletRequest request, HttpServletResponse response, Object handler ) throws Exception {
        return true;
    }

    // 执行方法之后执行
    @Override
    public void postHandle( HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView ) throws Exception {

    }

    // 最终执行的方法
    @Override
    public void afterCompletion( HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex ) throws Exception {

    }

}
