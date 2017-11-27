package com.spring.server;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 *
 * @author ykzhu
 */
@Service
public interface MyServer {
    public List<Map<String, Object>> getSever();
}
