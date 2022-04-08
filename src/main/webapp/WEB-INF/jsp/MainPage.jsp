<%@ page import="com.coffeecompany.entities.User" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Coffee Company page</title>
</head>
<body>
<h1>Coffee Company main page</h1>
<% User user = (User) session.getAttribute("companyUser");
    String name = user.getName();
%>
<h2>Hello <%=name%>
</h2>
<a href='http://localhost:8080/coffeeCompany/coffeecompany/coffee'>coffee</a><br>
<a href='http://localhost:8080/coffeeCompany/coffeecompany/truck'>trucks</a>
</body>
</html>
