package com.thinking.machines.servlets;
 import java.io.*;
 import javax.servlet.*;
 import java.sql.*;
 import javax.servlet.ServletException;
 import javax.servlet.http.*;
 public class TopTierServlet extends HttpServlet 
{
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
try{
 Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kdt","kdtuser","kdtuser");
 PreparedStatement ps=con.prepareStatement("select RollNo,Semester,SUM(Total) AS Totals from student   group by RollNo order by SUM(Total) desc LIMIT 10");
ResultSet rs=ps.executeQuery();
out.println("<!DOCTYPE html>");
 out.println("<html lang='en'>"); 
 out.println("<head>"); 
out.println("<title>CSS Template</title>"); 
 out.println("<meta charset='utf-8'>"); 
 out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>"); 
 out.println("<style> "); 
out.println(".styled-table { border-collapse: collapse;  margin: 35px 100px; font-size: 1.1em;  font-family: sans-serif; min-width: 700px; box-shadow: 0 0 20px rgba(28,40,51); } "); 
out.println(".styled-table thead tr { background-color: #1C2833; color: #ffffff; text-align: left; } "); 
out.println(".styled-table th, .styled-table td { padding: 12px 15px;  }"); 
 out.println(".styled-table tbody tr { border-bottom: 1px solid #dddddd; }"); 
 out.println(".styled-table tbody tr:last-of-type { border-bottom: 2px solid #A9A9A9; }"); 
 out.println(".styled-table tbody tr.active-row { font-weight: bold; color: #A9A9A9; }"); 
out.println(".container {  height: 50px; width: 1100px; margin: 55px 100px;  text-align: center; overflow: hidden; background-color: #1C2833;  color: #f2f2f2;}");
 out.println("</style>"); 
 out.println("</head>"); 
 out.println("<body> "); 
out.println("<table class='styled-table' >"); 
 out.println("<thead>"); 
 out.println("<tr>"); 
 out.println("<th >Roll No</th>"); 
out.println(" <th>Semester</th>"); 
out.println(" <th>Percentage</th>"); 
 out.println("</tr>"); 
 out.println("</thead>"); 
out.println("<tbody> "); 
Double Percentage = 0.0;
 while(rs.next())
 {
 String rollNo=rs.getString("RollNo");
 String Semester=rs.getString("Semester"); 
int Totals=rs.getInt("Totals");
Totals=Totals/6;
Percentage=Double.valueOf(Totals);
out.println("<tr width=' 700'  height='60'><td  width=' 700'  height='60' >"+rollNo+"</td><td  width=' 700'  height='60'>"+Semester+"</td><td  width=' 700'  height='60'>"+Percentage+"</td></tr>");
}
out.println("</table></body></html>");
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