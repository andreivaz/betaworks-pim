/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author andreivaz
 */
@Controller
public class LoginController {
    
    @RequestMapping("/login")
    public String loginForm(){
        return "views/login/login";
    }
    
    @RequestMapping("/logging")
    public String doLogin(){
        return "/views/home/home";
    }    
}
