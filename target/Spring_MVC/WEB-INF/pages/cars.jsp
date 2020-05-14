<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: GEORGY
  Date: 14.05.2020
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        <c:if test="${param.get(\"locale\").equals(\"ru\")}">
            Машины
        </c:if>
        <c:if test="${param.get(\"locale\").equals(\"es\")}">
            Cars
        </c:if>
    </title>
</head>
<body>
<c:forEach var="i" items="${cars_list}">
    <table>
        <tr>
                ${i.name}
        </tr>
        <tr>
                ${i.series}
        </tr>
        <tr>
                ${i.size}
        </tr>
    </table>
</c:forEach>
</body>
</html>
