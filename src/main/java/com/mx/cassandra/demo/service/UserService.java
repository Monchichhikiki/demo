package com.mx.cassandra.demo.service;

import com.mx.cassandra.demo.vo.User;
import org.springframework.stereotype.Component;

/**
 * @author qiqi
 * @date 2020-06-01 14:15
 */
@Component
public interface UserService {
    /**
     * 根据Id获取数据
     *
     * @param id
     * @return
     */
    User getById(String id);
}
