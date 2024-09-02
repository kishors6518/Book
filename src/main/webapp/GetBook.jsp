<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get the values</title>
</head>
<body>
<jsp:useBean id="b1" class="book.Book" scope="session"></jsp:useBean>
<jsp:getProperty property="title" name="b1"/>
<jsp:getProperty property="author" name="b1"/>
<jsp:getProperty property="price" name="b1"/>
<jsp:getProperty property="pages" name="b1"/>

</body>
</html>