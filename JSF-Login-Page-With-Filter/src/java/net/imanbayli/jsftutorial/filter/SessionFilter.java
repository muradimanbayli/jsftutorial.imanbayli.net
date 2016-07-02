/*
 * SessionFilter.java
 * Created by Murad R. Imanbayli <muradimanbayli at gmail.com> on Jul 2, 2016  9:48:28 PM
 * Copyright www.imanbayli.net 2016.All rights reserved
 */
package net.imanbayli.jsftutorial.filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Murad R. Imanbayli <muradimanbayli at gmail.com>
 */
@WebFilter(filterName = "SessionFilter", urlPatterns = {"/*"})
public class SessionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req1=(HttpServletRequest)request;
        HttpServletResponse res1=(HttpServletResponse)response;
        
        String sessionUser=(String)req1.getSession().getAttribute("username");
        String currentPath=req1.getRequestURL().toString();
        
        if(sessionUser!=null){
            if(currentPath.contains("JSF-Login-Page-With-Filter/index.jsf")){
                res1.sendRedirect(req1.getContextPath()+"/inner/index.jsf");
            }else{
                chain.doFilter(request, response);
            }
        }else{
            if(currentPath.contains("inner")){
                res1.sendRedirect(req1.getContextPath()+"/index.jsf");
            }else{
                chain.doFilter(request, response);
            }
        }
        
       
    }

    @Override
    public void destroy() {
        
    }
    
   
    
}
