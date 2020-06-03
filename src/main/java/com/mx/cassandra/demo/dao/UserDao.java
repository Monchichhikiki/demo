package com.mx.cassandra.demo.dao;

import com.mx.cassandra.demo.vo.User;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qiqi
 * @date 2020-06-01 23:45
 */
@Repository
public class UserDao {
    @Autowired
    private CassandraTemplate cassandraTemplate;

    public User getUser() {
        List<User> list = cassandraTemplate.select("", User.class);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }
}
