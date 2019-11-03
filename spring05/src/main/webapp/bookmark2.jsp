<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>북마크시작페이지</title>
</head>
<body style ="backgoroun-color : yellow;">
<h3>북마크검색</h3>
<hr color="red" >
<form action = "insert">
순서 <input type = "text" name="num"><br>
아이디 <input type = "text" name="id"><br>
사이트 <input type = "text" name="address"><br>
<input type ="submit" value ="서버 전송">
</form>

<form action = "delete">
삭제할 순번 <input type = "text" name="num"><br>
<input type ="submit" value ="삭제하기">
</form>



</body>
</html>