/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.costommvc.servlet;

import com.ncit.costommvc.service.ProjectService;
import com.ncit.costommvc.service.daoImpl.ProjectServiceImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DefaultServlet extends HttpServlet {
    private ProjectService projectService=new ProjectServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("projects", projectService.getAll());
        RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/Views/index.jsp");
        dispatcher.forward(request, response);
    }
    
    
}
