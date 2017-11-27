package com.spring.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pub.util.HibernateUtil;

/**
 * TODO: 请设置类型说明
 *
 * @author ykzhu
 */
@Repository
public class TestDao {
    public List<Map<String, Object>> getString() {
        return HibernateUtil.queryList( "SELECT * FROM PARA_COMMON" );
    }
}
