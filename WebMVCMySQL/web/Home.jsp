<%-- 
    Document   : Home
    Created on : 15-mar-2022, 19:33:20
    Author     : eusebioajas
--%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Home Page</title>
    </head>
    <body>
        <center><h2>Home Page</h2></center>
        Welcome <%=request.getAttribute("userName")%>
        <div style="text-align: right"><a href="LogoutServlet">Logout</a></div>
    </body>
</html>