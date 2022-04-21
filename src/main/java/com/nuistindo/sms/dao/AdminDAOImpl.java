package com.nuistindo.sms.dao;

import com.nuistindo.sms.dbc.DatabaseConnection;
import com.nuistindo.sms.model.Admin;

import java.sql.*;
import java.util.List;

public class AdminDAOImpl implements AdminDAO {

    private Connection conn;

    public AdminDAOImpl() {
        this.conn = new DatabaseConnection().createConnection();
    }


    @Override
    public Admin getAdmin(String username) throws SQLException {
        Admin admin = null;
        String query = "SELECT * FROM admin WHERE username = ?";
        java.sql.PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            admin = new Admin();
            admin.setId(rs.getInt("id"));
            admin.setUsername(rs.getString("username"));
            admin.setPassword(rs.getString("password"));
        }
        rs.close();
        pstmt.close();
        return admin;
    }

    @Override
    public List<Admin> getAllAdmin() {
        return null;
    }

    @Override
    public boolean addAdmin(Admin admin) throws SQLException {
        String query = "INSERT INTO admin (username, password) VALUES (?, ?)";
        PreparedStatement pstmt =this.conn.prepareStatement(query);
        pstmt.setString(1, admin.getUsername());
        pstmt.setString(2, admin.getPassword());
        int lines = pstmt.executeUpdate();

        pstmt.close();
        return lines > 0;
    }

    @Override
    public boolean updateAdmin(Admin admin) throws SQLException {
        String query = "UPDATE admin SET password = ? WHERE username = ?";
        PreparedStatement pstmt = this.conn.prepareStatement(query);
        pstmt.setString(1, admin.getPassword());
        pstmt.setString(2, admin.getUsername());

        int lines = pstmt.executeUpdate();
        pstmt.close();
        return lines > 0;
    }

    @Override
    public boolean deleteAdmin(List<String> ids) throws SQLException {
        StringBuilder query = new StringBuilder();
        query.append("DELETE FROM admin WHERE ");
        for (String id : ids) {
            query.append(" id = ? or");
        }
        String strquery = query.toString().substring(0,query.length() - 2 ) + ";";
        PreparedStatement pstmt = this.conn.prepareStatement(strquery);

        for (int i = 0; i < ids.size(); i++) {
            pstmt.setInt(1 + i, Integer.parseInt(ids.get(i)));
        }

        int lines = pstmt.executeUpdate();
        pstmt.close();
        return lines > 0;

    }
}
