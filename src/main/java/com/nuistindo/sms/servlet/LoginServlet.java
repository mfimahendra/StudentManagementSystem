package com.nuistindo.sms.servlet;

import com.nuistindo.sms.dao.AdminDAO;
import com.nuistindo.sms.model.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Admin admin = (Admin) session.getAttribute("LoggedAdmin");
        response.sendRedirect("/view/admin/dashboard.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        try (PrintWriter out = response.getWriter()) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            com.nuistindo.sms.service.AdminDAO adminDAO = new AdminDAO();
            Admin admin = adminDAO.logAdmin(username, password);
            if (admin != null) {
                HttpSession session = request.getSession();
                session.setAttribute("LoggedAdmin", admin);
                response.sendRedirect("/view/admin/dashboard.jsp");
            } else {
                out.println("unknown Credentials");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
