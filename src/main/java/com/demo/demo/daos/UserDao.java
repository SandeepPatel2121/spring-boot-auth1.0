/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.demo.daos;

import com.demo.demo.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author ABC
 */
public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>{

    public User findByUsername(String username);
    
}
