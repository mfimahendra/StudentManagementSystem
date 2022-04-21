package com.nuistindo.sms.dbc;

import java.sql.*;

public class DatabaseConnection {

    public Connection createConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_university_system", "root", "$_=+St3ph1n3");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
