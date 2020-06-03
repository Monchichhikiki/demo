package com.mx.cassandra.demo.controller;

import com.mx.cassandra.demo.service.UserService;
import com.mx.cassandra.demo.vo.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiqi
 * @date 2020-06-01 14:20
 */
@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam(defaultValue = "1") String id) {
        if (StringUtils.isBlank(id)) {
            return null;
        }
        User user = userService.getById(id);
        return user.toString();
    }
}
