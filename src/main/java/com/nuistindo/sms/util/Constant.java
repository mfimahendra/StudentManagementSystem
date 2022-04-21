package com.nuistindo.sms.util;

import javax.print.DocFlavor;

public interface Constant {

    interface State {
        String SUCCESS = "success";
        String FAIL = "fail";
        String WRONG = "wrong";
        String NOT_EXIST = "not_exist";
    }

    interface Item {
        String USERNAME = "username";
        String PASSWORD = "password";
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
