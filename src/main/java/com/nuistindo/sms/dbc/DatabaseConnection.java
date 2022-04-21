package com.nuistindo.sms.dbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public Connection createConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_admin", "guest", "guest");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
