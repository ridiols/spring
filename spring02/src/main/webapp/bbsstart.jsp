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
���̵� <input type = "text" name ="id"><br>
���� <input type = "text" name ="title"><br>
���� <input type = "text" name ="content"><br> 
�۾��� <input type = "text" name ="writer"><br>  
<input type=submit value="����������">
</form>

<form action ="bbsdelete.do">
���̵� <input type = "text" name ="id"><br>
<input type=submit value="�� �� �����ϱ�">
</form>

</body>
</html>