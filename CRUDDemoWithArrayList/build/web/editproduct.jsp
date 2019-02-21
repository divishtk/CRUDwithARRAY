
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h2>Update Product</h2>
        <form action="EditController" method="post">
            <table border="1">
                <tr>
                    <td>Product id</td>
                    <td><input type="text" name="pid" value="${p.product_id}" readonly/></td>
                </tr>
                <tr>
                    <td>product name</td>
                    <td><input type="text" name="pname" value="${p.product_name}"/></td>
                </tr>
                <tr>
                    <td>product price</td>
                    <td><input type="text" name="price" value="${p.price}"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Update"/></td>
                    <td><input type="reset" value="Reset"/></td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
