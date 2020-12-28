package com.thinking.machines.dl;
import java.sql.*;

public class Validate {
    public static boolean checkUser(String username,String password) 
    {
        boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");
//creating connection with the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost: 3306/kdt","kdtuser","kdtuser");
            PreparedStatement ps =con.prepareStatement("select * from administrator where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            st = rs.next();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
}
