<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action ="bbsinsert.do">
아이디 <input type = "text" name ="id"><br>
제목 <input type = "text" name ="title"><br>
내용 <input type = "text" name ="content"><br> 
글쓴이 <input type = "text" name ="writer"><br>  
<input type=submit value="서버로전송">
</form>

<form action ="bbsdelete.do">
아이디 <input type = "text" name ="id"><br>
<input type=submit value="내 글 삭제하기">
</form>

</body>
</html>