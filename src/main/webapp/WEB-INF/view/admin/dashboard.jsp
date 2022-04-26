<%@ page import="com.nuistindo.sms.model.Admin" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Admin admin = (Admin) session.getAttribute("LoggedAdmin");
//    if (admin == null) {
//        response.sendRedirect("/");
//    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin System</title>
</head>
<body>
  <h1>Admin System</h1>
  <form action="logout" method="post">
    <input type="submit" value="Logout">
  </form>
</body>
</html>
