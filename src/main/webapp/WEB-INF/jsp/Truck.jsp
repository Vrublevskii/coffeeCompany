<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.coffeecompany.entities.coffee.Coffee" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Truck</title>
</head>
<body>
<table border="3">
    <tr>
        <td>
            Coffee sort
        </td>
        <td>
            Coffee price
        </td>
        <td>
            Coffee container
        </td>
        <td>
            Coffee weight
        </td>
    </tr>
    <%!String sort;%>
    <%!Double price;%>
    <%!String container;%>
    <%!int weight;%>

    <% for (Coffee coffee : (ArrayList<Coffee>) session.getAttribute("coffees")) {
        sort = coffee.getSort();
        price = coffee.getPriceTotal();
        container = coffee.getContainer();
        weight = coffee.getWeightWithContainer();
    %>
    <tr>
        <td>
            <%=sort%>
        </td>
        <td>
            <%=price%>
        </td>
        <td>
            <%=container%>
        </td>
        <td>
            <%=weight%>
        </td>
    </tr>
    <%}%>
</table>

<form method="get">
    <input type="submit" value="SortCargo" name="sort">
</form>

<a href='http://localhost:8080/coffeeCompany/coffeecompany'>back</a>

</body>
</html>
