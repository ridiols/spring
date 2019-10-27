<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link  rel="stylesheet" type="text/css" href="resources/css/out2.css"/> 
<script type="text/javascript" src = "resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function() {	
	var titleValue = $('.title');
	var	contentValue = $('.content');
	var writerValue = $('.writer');
});

</script>

</head>

<body>
제목 : <input type= "text" name="title" class="title" value ="spring"><br>
내용 : <input type= "text" name="content" class="content" value ="spring"><br>
작성자 : <input type= "text" name="writer" class="writer" value ="spring"><br>

</body>
</html>