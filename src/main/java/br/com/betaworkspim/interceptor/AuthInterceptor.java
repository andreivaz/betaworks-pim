/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.betaworkspim.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * @author andreivaz
 */
public class AuthInterceptor extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller) throws Exception {
        String uri = request.getRequestURI();
        if(uri.endsWith("login") || uri.endsWith("doLogin") || uri.contains("resources")){
            return true;
        }
        if(request.getSession().getAttribute("userlogged") != null){
            return true;
        }
        response.sendRedirect("login");
        return false;
    }
    
    
    
}
