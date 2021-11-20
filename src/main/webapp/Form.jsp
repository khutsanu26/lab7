<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Создание PDF-документа</title>

<link rel="stylesheet" href="css/stylepdf.css">

</head>
<body>

<h1 class="headline">Создать отчёт по успеваемости</h1>
<p>Создается PDF-файл с текстом, изображением и таблицей. Данные в таблицу вносятся с формы ниже по ячейкам.</p>

    <form action="generate_pdf" method="GET">
        <label for="FIO">ФИО:     </label>
        <input type="text" name="userName" id="FIO">
        <p></p>
        <label for="Group">Группа: </label>
        <input type="text" name="groupName" id="Group">
        <p></p>
        <label for="Points">Оценка: </label>
        <input type="text" name="userMark" id="Points">
        <p></p>     
        <input type="submit" value="Создать отчёт">
    </form>
    </body>
</html>