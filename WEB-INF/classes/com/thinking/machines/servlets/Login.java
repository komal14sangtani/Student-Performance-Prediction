package com.thinking.machines.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.thinking.machines.dl.*;
public class Login extends HttpServlet{
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
  response.setContentType("text/html;charset=UTF-8");
   PrintWriter out = response.getWriter();
   String name = request.getParameter("name");
   String pass= request.getParameter("pass");
        
        if(Validate.checkUser(name, pass))
        {
  RequestDispatcher rs = request.getRequestDispatcher("Dashboard.html");
   rs.forward(request, response);
    }
        else
        {
        response.sendRedirect("/Project/InvalidPass.html");
        }
    }  
}

