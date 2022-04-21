package com.nuistindo.sms.service;

import com.nuistindo.sms.model.Admin;

import java.sql.SQLException;
import java.util.List;

public interface AdminDAO {

    Admin logAdmin(String username, String password) throws SQLException;

    List<Admin> getAllAdmin();

    boolean addAdmin(Admin admin) throws SQLException;

    boolean updateAdmin(Admin admin) throws SQLException;

    boolean deleteAdmin(List<String> ids) throws SQLException;
}
