package com.core.server;

import java.io.IOException;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.pub.util.DateUtil;

/**
 * TODO: 请设置类型说明
 *
 * @author ykzhu
 */
public class WebConfig implements Filter {
    private Log log = LogFactory.getLog( this.getClass() );

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter( ServletRequest request, ServletResponse response, FilterChain chain ) throws IOException, ServletException {
        chain.doFilter( request, response );
    }

    @Override
    public void init( FilterConfig config ) throws ServletException {
        log.info( DateUtil.dateTimeString( new Date() ) + " 正在启动服务..." );
        log.info( DateUtil.dateTimeString( new Date() ) + " 开始初始化上下文参数..." );
        configContext( config.getServletContext() );
        log.info( DateUtil.dateTimeString( new Date() ) + " 上下文参数初始化完成..." );
        log.info( DateUtil.dateTimeString( new Date() ) + " 服务启动完成..." );
    }

    /**
     * 配置上下文参数
     * 
     * @param context
     */
    private void configContext( ServletContext context ) {
        // 获取上下文路径
        String contextPath = context.getContextPath();
        // 配置系统所在位置
        context.setAttribute( "APP_PATH", contextPath );
        // 配置脚本文件所在位置
        context.setAttribute( "APP_JS", contextPath + "/static/js/" );
        // 配置样式文件所在位置
        context.setAttribute( "APP_CSS", contextPath + "/static/css/" );
        // 配置图片所在位置
        context.setAttribute( "APP_CSS", contextPath + "/static/img/" );
    }

}
