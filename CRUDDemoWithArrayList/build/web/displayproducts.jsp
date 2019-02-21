<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h3><a href="addproduct.jsp">add more products</a></h3>
        <table border="1">
            <tr>
                <th>Product Id</th>
                <th>product name</th>
                <th>price</th>
                <th>Edit | Delete</th>
            </tr>
            
            <c:set var="i" value="0"/>
            <c:forEach items="${products}" var="prod">
                <tr>
                    <td>${prod.product_id}</td>
                    <td>${prod.product_name}</td>
                    <td>${prod.price}</td>
                    <td><a href="EditController?index=${i}">Edit</a> | <a href="DeleteController?index=${i}">Delete</a></td>
                    <c:set var="i" value="${i+1}"/>
                </tr>
            </c:forEach>
        </table>
    </center>
    </body>
</html>
