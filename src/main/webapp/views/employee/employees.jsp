<%-- 
    Document   : employees
    Created on : 02/09/2015, 16:51:23
    Author     : andreivaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Employees List</h1>
 
	<c:forEach items="${employeesList}" var="employess">
		${cemployessar.name} ${car.model}: ${car.price}
		<br />
	</c:forEach>
    </body>
</html>
