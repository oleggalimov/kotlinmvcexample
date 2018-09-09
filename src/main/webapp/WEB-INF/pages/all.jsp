<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ru">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Мое приложение</title>


</head>

<body>
<table>
<c:forEach var="currentEvent" items="${events}">
    <tr>
        <td><c:out value="${currentEvent[0]}"></c:out></td>
        <td><c:out value="${currentEvent[1]}"></c:out></td>
        <td><c:out value="${currentEvent[2]}"></c:out></td>
        <td>
        <img src="data:image/png;base64,<c:out value="${currentEvent[3]}"></c:out>"width="128" height="128" />
        </td>
    </tr>
</c:forEach>
</table>



  <footer class="container">
      <p>&copy; Олег Галимов, 2018<br/>o.d.galimov@yandex.ru</p>
   </footer>

</body>

</html>