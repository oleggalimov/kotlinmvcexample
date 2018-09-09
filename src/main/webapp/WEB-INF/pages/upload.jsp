<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <link rel="icon" href="static/icon/favicon.ico">

  <title>Мое приложение</title>

  <!-- Bootstrap core CSS -->
  <link href="static/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="static/css/jumbotron.css" rel="stylesheet">
</head>

<body>
Web Application Context Path = ${pageContext.request.contextPath}
<FORM ACTION="${pageContext.request.contextPath}/upload"
      ENCTYPE="multipart/form-data"
      METHOD=POST>

What is your name? <INPUT TYPE=TEXT NAME=submitter><br>

What file are you sending? <INPUT TYPE=FILE NAME=file><br>

<input type="submit" value=Submit><br>

</FORM>
</body>

</html>