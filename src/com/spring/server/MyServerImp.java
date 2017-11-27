package com.spring.server;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.TestDao;

/**
 * TODO: 请设置类型说明
 *
 * @author ykzhu
 */
@Service
public class MyServerImp implements MyServer {
    @Autowired
    private TestDao testDao;

    @Override
    public List<Map<String, Object>> getSever() {
        return testDao.getString();
    }

}
