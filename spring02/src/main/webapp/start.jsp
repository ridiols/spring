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
아이디 <input type = "text" name ="id"><br>
패스워드 <input type = "text" name ="pw"><br>
이름 <input type = "text" name ="name"><br> 
전화번호 <input type = "text" name ="tel"><br>  
<input type=submit value="서버로전송">
</form>

<hr color="purple">

<form action ="select.do">
아이디 <input type = "text" name ="id"><br>
<input type=submit value="아이디로 검색">
</form>

<hr color="purple">

<form action ="delete">
아이디 <input type = "text" name ="id"><br>
<input type=submit value="id로 탈퇴">
</form>
</body>
</html>