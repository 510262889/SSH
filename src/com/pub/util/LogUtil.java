package com.pub.util;

import org.apache.commons.logging.LogFactory;

public class LogUtil {

    public static void logNothing( Throwable t ) {
    }

    public static void debug( Class clazz, String message ) {
        LogFactory.getLog( clazz ).debug( message );
    }

    public static void info( Class clazz, String message ) {
        LogFactory.getLog( clazz ).info( message );
    }

    public static void warn( Class clazz, String message ) {
        LogFactory.getLog( clazz ).warn( message );
    }

    public static void error( Class clazz, String message ) {
        LogFactory.getLog( clazz ).error( message );
    }

    public static void fatal( Class clazz, String message ) {
        LogFactory.getLog( clazz ).fatal( message );
    }

    public static boolean isDebugEnabled( Class clazz ) {
        return LogFactory.getLog( clazz ).isDebugEnabled();
    }

    public static boolean isInfoEnabled( Class clazz ) {
        return LogFactory.getLog( clazz ).isInfoEnabled();
    }

    public static boolean isWarnEnabled( Class clazz ) {
        return LogFactory.getLog( clazz ).isWarnEnabled();
    }

    public static boolean isErrorEnabled( Class clazz ) {
        return LogFactory.getLog( clazz ).isErrorEnabled();
    }

    public static boolean isFatalEnabled( Class clazz ) {
        return LogFactory.getLog( clazz ).isFatalEnabled();
    }
}
