<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Результат создания файла PDF</title>
<link rel="stylesheet" href="css/stylepdf.css">
</head>
<body>
<h1 class="headline">Файл PDF создан</h1>
<p><strong>ФИО: </strong> ${userName}</p>
<p><strong>Группа: </strong> ${groupName}</p>
<p><strong>Оценка: </strong> ${userMark}</p>

<a href="${reportLink}">Открыть PDF-файл</a>
<a href="${reportLink}" download>Скачать PDF-файл</a><br>

<form action="${pageContext.request.contextPath}/Form.jsp">
    <input type="submit" value="На главную страницу">
</form>

</body>
</html>