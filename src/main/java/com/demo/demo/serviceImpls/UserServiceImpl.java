/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.demo.serviceImpls;

import com.demo.demo.daos.UserDao;
import com.demo.demo.entitys.User;
import com.demo.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ABC
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;
    
    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
    
}
