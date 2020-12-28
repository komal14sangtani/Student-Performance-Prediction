package com.thinking.machines.servlets;
 import java.io.*;
 import javax.servlet.*;
 import java.sql.*;
 import javax.servlet.ServletException;
 import javax.servlet.http.*;
 public class ChangePasswordServlet extends HttpServlet 
{
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();

String NewPassword=request.getParameter("NewPassword"); 
String ConfirmPassword=request.getParameter("ConfirmPassword");
try{
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kdt","kdtuser","kdtuser");
PreparedStatement ps=con.prepareStatement("update administrator set password = ? where username = 'admin' ");
 ps.setString(1,NewPassword); 
int i=ps.executeUpdate();
if(i>0)
{
response.sendRedirect("/Project/PassSucc.html");
}
else
{
out.println("Password does not Change Try Again.......");
}
 }catch (Exception e2) 
{
 e2.printStackTrace(); 
}
 finally
{ 
out.close();
}
} 
}
