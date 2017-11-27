package com.spring.annitation.imp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ykzhu
 */
public class ReturnJsonAnnotationImp implements HandlerInterceptor {

    @Override
    public boolean preHandle( HttpServletRequest arg0, HttpServletResponse arg1, Object arg2 ) throws Exception {
        HandlerMethod method = (HandlerMethod) arg2;
        System.out.println( method );
        return true;
    }

    @Override
    public void afterCompletion( HttpServletRequest request, HttpServletResponse response, Object arg2, Exception exception ) throws Exception {
        //从传入的handler中检查是否有AuthCheck的声明
        //        HandlerMethod method = (HandlerMethod) arg2;
        //        boolean hasReturnJson = method.getMethodAnnotation( ReturnJson.class ) != null;
        //        if ( hasReturnJson ) {
        //            // 设置响应头
        //            response.setCharacterEncoding( "UTF-8" );
        //            response.setContentType( "text/html;charset=UTF-8" );
        //            response.setHeader( "pragma", "no-cache" );
        //            response.setHeader( "chche-control", "no-cache" );
        //            // 返回Json数据
        //            //            PrintWriter writer = null;
        //            //            try {
        //            //                writer = response.getWriter();
        //            //                writer.write( (String) returnValue );
        //            //                writer.close();
        //            //            } catch ( Exception e ) {
        //            //                LogUtil.warn( getClass(), "返回Json格式数据失败！" );
        //            //            }
        //        }
    }

    @Override
    public void postHandle( HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3 ) throws Exception {

    }

    //    @Override
    //    public void handleReturnValue( Object returnValue, MethodParameter mParameter, ModelAndViewContainer mViewContainer, NativeWebRequest nWebRequest ) throws Exception {
    //        mViewContainer.setRequestHandled( true );
    //        // 设置响应头
    //        HttpServletResponse response = nWebRequest.getNativeResponse( HttpServletResponse.class );
    //        response.setCharacterEncoding( "UTF-8" );
    //        response.setContentType( "text/html;charset=UTF-8" );
    //        response.setHeader( "pragma", "no-cache" );
    //        response.setHeader( "chche-control", "no-cache" );
    //        // 返回Json数据
    //        PrintWriter writer = null;
    //        try {
    //            writer = response.getWriter();
    //            writer.write( (String) returnValue );
    //            writer.close();
    //        } catch ( Exception e ) {
    //            LogUtil.warn( getClass(), "返回Json格式数据失败！" );
    //        }
    //
    //    }
    //
    //    @Override
    //    public boolean supportsReturnType( MethodParameter parameter ) {
    //        System.out.println( "进入了" );
    //        // 如果使用了ReturnJson注解 就用这个Handler 来处理
    //        boolean hasReturnJson = parameter.getMethodAnnotation( ReturnJson.class ) != null;
    //        return hasReturnJson;
    //    }

}
