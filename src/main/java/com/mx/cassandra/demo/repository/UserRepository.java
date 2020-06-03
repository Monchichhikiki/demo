package com.mx.cassandra.demo.repository;

import com.mx.cassandra.demo.vo.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

/**
 * @author qiqi
 * @date 2020-06-01 14:13
 */
@Repository
public interface UserRepository extends CassandraRepository<User, String> {

}
