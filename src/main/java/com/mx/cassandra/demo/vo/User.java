package com.mx.cassandra.demo.vo;


import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.persistence.Entity;

/**
 * @author qiqi
 * @date 2020-06-01 14:05
 */
@Table
@Entity
public class User {

    @PrimaryKey
    private String user_id_hash;
    private String profile;
    private int user_id;

    public String getUser_id_hash() {
        return user_id_hash;
    }

    public void setUser_id_hash(String user_id_hash) {
        this.user_id_hash = user_id_hash;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id_hash='" + user_id_hash + '\'' +
                ", profile='" + profile + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
