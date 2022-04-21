package com.nuistindo.sms.service;

import com.nuistindo.sms.model.Admin;

public interface AdminService {

    public Admin login(String username, String password);
}
