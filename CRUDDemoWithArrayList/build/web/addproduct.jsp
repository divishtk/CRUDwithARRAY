<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h2>Add product</h2>
        <form action="AddProductController">
            <table>
                <tr>
                    <td>product id</td>
                    <td><input type="text" name="pid"/></td>
                </tr>
                <tr>
                    <td>product name</td>
                    <td><input type="text" name="pname"/></td>
                </tr>
                <tr>
                    <td>price</td>
                    <td><input type="text" name="price"/></td>
                </tr>
                <tr> 
                    <td><input type="submit" value="Add"/></td>
                    <td><input type="reset" value="Reset"/></td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
