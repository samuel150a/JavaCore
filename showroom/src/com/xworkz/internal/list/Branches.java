package com.xworkz.internal.list;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns ="/show",loadOnStartup = 1)
public class Branches extends GenericServlet {
    public Branches(){
        System.out.println("Running Branches const");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Branches");
    }
}
