<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action ="insert.do">
���̵� <input type = "text" name ="id"><br>
�н����� <input type = "text" name ="pw"><br>
�̸� <input type = "text" name ="name"><br> 
��ȭ��ȣ <input type = "text" name ="tel"><br>  
<input type=submit value="����������">
</form>

<hr color="purple">

<form action ="select.do">
���̵� <input type = "text" name ="id"><br>
<input type=submit value="���̵�� �˻�">
</form>

<hr color="purple">

<form action ="delete">
���̵� <input type = "text" name ="id"><br>
<input type=submit value="id�� Ż��">
</form>
</body>
</html>