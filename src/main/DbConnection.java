package main;

import java.sql.*;


public class DbConnection {
   private static Connection conn = null;
   public Connection connect() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/edu_pro?verifyServerCertificate=false&useSSL=true", "root", "");
                return conn;
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
        return conn;
    }
}
