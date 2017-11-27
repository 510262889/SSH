package com.pub.util;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;

/**
 * 数据库操作工具类
 *
 * @author ykzhu
 */
public class HibernateUtil {

    public static List<Map<String, Object>> queryList( String sql, Object... parms ) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        if ( StringUtil.isBlank( sql ) ) return resultList;
        Configuration cfd = new Configuration();
        //buildSessionFactory()产生一个SessionFactory工厂
        SessionFactory sf = null;
        Session session = null;
        try {
            sf = cfd.configure().buildSessionFactory();
            session = sf.openSession();
            session.beginTransaction();
            // 创建查询对象
            SQLQuery query = session.createSQLQuery( sql );
            // 设置查询参数
            if ( StringUtil.notNull( parms ) ) {
                for ( int i = 1; i < parms.length; i++ ) {
                    Object parm = parms[i - 1];
                    if ( parm instanceof String ) query.setString( i, (String) parm );
                    else if ( parm instanceof Date ) query.setDate( i, (Date) parm );
                    else if ( parm instanceof BigDecimal ) query.setBigDecimal( i, (BigDecimal) parm );
                    else throw new RuntimeException( "第" + i + "个参数类型暂不支持!" );
                }
            }
            // 获取查询结果
            resultList = query.setResultTransformer( Transformers.ALIAS_TO_ENTITY_MAP ).list();
        } finally {
            if ( StringUtil.notNull( session ) ) session.close();
            if ( StringUtil.notNull( sf ) ) sf.close();
        }
        return resultList;
    }
}
