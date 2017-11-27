package com.spring.annitation.imp;

/**
 *
 * @author ykzhu
 */
public class ReturnJspAnnotationImp {

    //    @Override
    //    public void handleReturnValue( Object returnValue, MethodParameter mParameter, ModelAndViewContainer mViewContainer, NativeWebRequest nWebRequest ) throws Exception {
    //        mViewContainer.setRequestHandled( true );
    //        try {
    //            // 设置响应头
    //            HttpServletResponse response = nWebRequest.getNativeResponse( HttpServletResponse.class );
    //            response.setCharacterEncoding( "UTF-8" );
    //            response.setContentType( "text/html;charset=UTF-8" );
    //            response.setHeader( "pragma", "no-cache" );
    //            response.setHeader( "chche-control", "no-cache" );
    //            // 获取请求
    //            HttpServletRequest request = nWebRequest.getNativeRequest( HttpServletRequest.class );
    //            String url = request.getSession().getServletContext().getContextPath() + "a";
    //            // 转发
    //            request.getRequestDispatcher( "" ).forward( request, response );
    //        } catch ( Exception e ) {
    //            LogUtil.warn( getClass(), "调整页面失败！" );
    //        }
    //
    //    }
    //
    //    @Override
    //    public boolean supportsReturnType( MethodParameter parameter ) {
    //        return parameter.getMethodAnnotation( ReturnJsp.class ) != null;
    //    }

}
