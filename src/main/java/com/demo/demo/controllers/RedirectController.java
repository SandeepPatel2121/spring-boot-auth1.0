/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.demo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ABC
 */
@RestController
public class RedirectController {
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView getUserHomeView() {
        return new ModelAndView("home");
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLoginView() {
        return new ModelAndView("util/login");
    }
    
    @RequestMapping(value = "/logout-success", method = RequestMethod.GET)
    public ModelAndView getLogoutSuccessView() {
        return new ModelAndView("util/logout-success");
    }
        
    @PreAuthorize("hasAnyRole('Admin')")
    @RequestMapping(value = "/secure", method = RequestMethod.GET)
    public ModelAndView getSecureView() {
        return new ModelAndView("/util/secure-page");
    }
    
}
