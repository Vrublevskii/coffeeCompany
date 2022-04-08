<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.coffeecompany.entities.User" %>
<%@ page import="com.coffeecompany.constants.CoffeeContainers" %>
<%@ page import="com.coffeecompany.entities.coffee.*" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Coffee</h1>
<%!List<Coffee> coffees = new ArrayList<>();%>
<% User user = (User) session.getAttribute("companyUser");
    String name = user.getName();
    session.setAttribute("coffees", coffees);
    String sort = request.getParameter("sort");;
    double price = 0;
    String container = null;
    int weight = 0;
    CoffeeContainers bag = null;

    if (sort != null){
        price = Double.parseDouble(request.getParameter("price"));
        container = request.getParameter("container");
        weight = Integer.parseInt(request.getParameter("weight"));
    }

    if (sort != null) {
        switch (container) {
            case ("BEANS_IN_BAG"):
                bag = CoffeeContainers.BEANS_IN_BAG;
                break;
            case ("JAR"):
                bag = CoffeeContainers.JAR;
                break;
            case ("BAG"):
                bag = CoffeeContainers.BAG;
                break;
            case ("ONE_PORTION_BAG"):
                bag = CoffeeContainers.ONE_PORTION_BAG;
                break;
        }

        switch (sort) {
            case ("Arusha"):
                coffees.add(new Arusha(price, bag, weight));
                break;
            case ("BlueMountain"):
                coffees.add(new BlueMountain(price, bag, weight));
                break;
            case ("Java"):
                coffees.add(new Java(price, bag, weight));
                break;
            case ("Sagada"):
                coffees.add(new Sagada(price, bag, weight));
                break;
        }
    }

%>
<h2><%=name%>
</h2>
<form>
    <label for="sort">Choose a sort:<br></label>
    <select id="sort" name="sort">
        <option value="Arusha">Arusha</option>
        <option value="BlueMountain">BlueMountain</option>
        <option value="Java">Java</option>
        <option value="Sagada">Sagada</option>
    </select>
    <br>
    <br>
    <label for="price">Price:</label><br>
    <input type="text" id="price" name="price" value="200">
    <br>
    <br>
    <label for="coffeeContainer">Choose a container:<br></label>
    <select id="coffeeContainer" name="container">
        <option value="BEANS_IN_BAG">Coffee beans in a bag</option>
        <option value="JAR">Jar with coffee</option>
        <option value="BAG">Bag with coffee</option>
        <option value="ONE_PORTION_BAG">Coffee bag, one portion</option>
    </select>
    <br>
    <br>
    <label for="weight">Weight:</label><br>
    <input type="text" id="weight" name="weight" value="100">
    <br>
    <br>
    <input type="submit" value="Submit">
</form>
<br>
<br>

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
    <%!String sort1;%>
    <%!Double price1;%>
    <%!String container1;%>
    <%!int weight1;%>

<%--     List<Coffee> coffees = (ArrayList<Coffee>) session.getAttribute("coffees");--%>
    <% if (coffees != null) {
            for (Coffee coffee : coffees) {
                sort1 = coffee.getSort();
                price1 = coffee.getPriceTotal();
                container1 = coffee.getContainer();
                weight1 = coffee.getWeightWithContainer();
    %>
    <tr>
        <td>
            <%=sort1%>
        </td>
        <td>
            <%=price1%>
        </td>
        <td>
            <%=container1%>
        </td>
        <td>
            <%=weight1%>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>
<a href='http://localhost:8080/coffeeCompany/coffeecompany'>back</a>
</body>
</html>
