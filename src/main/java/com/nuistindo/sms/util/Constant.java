package com.nuistindo.sms.util;

import javax.print.DocFlavor;

public interface Constant {

    interface state {
        String SUCCESS = "success";
        String FAIL = "fail";
        String WRONG = "wrong";
        String NOT_EXIST = "not_exist";
    }

    interface Item {
        String username = "username";
        String password = "password";
    }

    interface Operation {
        String LOGIN = "login";
        String REGISTER = "register";
        String QUERY = "query";
        String IS = "is";
        String MODIFY = "modify";
        String DELETE = "delete";
    }
}
