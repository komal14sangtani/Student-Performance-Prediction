package com.thinking.machines.servlets;
 import java.io.*;
 import javax.servlet.*;
 import java.sql.*;
 import javax.servlet.ServletException;
 import javax.servlet.http.*;
 public class SearchServlet extends HttpServlet 
{
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 String rollNo=request.getParameter("RollNo");
try{
 Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kdt","kdtuser","kdtuser");
 PreparedStatement ps=con.prepareStatement(" select * from student where RollNo=?");
 ps.setString(1,rollNo); 

ResultSet rs=ps.executeQuery();

int total=0;
int found=1;
int i=0;
Double Percentage = 0.0;
 while(rs.next())
 {
found=0;
String Rn =rs.getString(2);
String Semester=rs.getString(3); 
String SubjectCode=rs.getString(4);
 String SubjectName=rs.getString(5);
 int Internal=rs.getInt(6);
 int External=rs.getInt(7);
 int Marks=rs.getInt(8);
 int  Total=rs.getInt(9);
String Department= rs.getString(10);
total=total+Internal+External+Marks;
if(found==0 && i==0)
{
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
 out.println(".styled-table tbody tr:nth-of-type(even) { background-color: #f3f3f3; }"); 
 out.println(".styled-table tbody tr:last-of-type { border-bottom: 2px solid #A9A9A9; }"); 
 out.println(".styled-table tbody tr.active-row { font-weight: bold; color: #A9A9A9; }"); 
out.println(".container {  height: 50px; width: 1100px; margin: 35px 100px;  text-align: center; overflow: hidden; background-color: #1C2833;  color: #f2f2f2;}");
 out.println("</style>"); 
 out.println("</head>"); 
 out.println("<body> "); 
out.println("<table class='styled-table' >"); 
 out.println("<thead>"); 
 out.println("<tr>"); 
 out.println("<th >Roll No</th>"); 
out.println(" <th>Semester</th>"); 
out.println(" <th >Subject Code</th>"); 
out.println(" <th>Subject Name</th>"); 
out.println(" <th>Internals</th>"); 
out.println(" <th >External</th>"); 
out.println(" <th >Marks</th>"); 
out.println(" <th >Total</th>"); 
out.println(" <th>Department</th>"); 
 out.println("</tr>"); 
 out.println("</thead>"); 
out.println("<tbody> "); 
}
if(found==0)
{
out.println("<tr width=' 100'  height='60'><td >"+Rn+"</td><td>"+Semester+"</td><td>"+SubjectCode+"</td><td>"+SubjectName+"</td><td>"+Internal+"</td><td>"+External+"</td><td>"+Marks+"</td><td>"+Total+"</td><td>"+Department+"</td></tr>");
}
i++;
}
if(found==0)
 {
total=total/6;
Percentage=Double.valueOf(total);
out.println("<tr width=' 500' height='60'><td  colspan='9'  style='text-align:center'><b>PERCENTAGE "+Percentage+"</b> </td></tr>");
out.println("</tbody></table>");


if(Percentage>=60.0)
{
out.println("<div class ='container'><h2><i>You Pass with First  Division</i></h2>" );
}
else if(Percentage>=45.0&&Percentage<60.0)
{
out.println("<div class ='container'><h2><i>You Pass with Second  Division</i></h2>" );
}
else if(Percentage>=33.0&&Percentage<45.0)
{
out.println("<div class ='container'><h2><i>You Pass with Third Division</i></h2>" );
}
else
{
out.println("<div class ='container'><h2><i>You Fail</i></h2>" );
}
out.println("</body></html>");

}
else
{
response.sendRedirect("/Project/Invalid.html");
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

