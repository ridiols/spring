<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- ������ -->
<!-- url������ ���̵�, "http://java.sun.com/jsp/jstl/core" �� �ٿ�ε� ���°��ƴ϶� id�����̴�. jstl/core �� ���������� �ִµ� core �� �⺻�� �ش��Ѵ�.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�˻� ������</title>
</head>
<body>

��� �������Դϴ�. <br>
<!-- 
<table>
<tr><td> <c:forEach var = "result" items = "${list}">id : ${result.id}</c:forEach></td></tr>
<tr><td> <c:forEach var = "result" items = "${list}">number : ${result.num}</c:forEach></td></tr>
<tr><td> <c:forEach var = "result" items = "${list}">address : ${result.address}</c:forEach></td></tr>
</table> -->
 
<c:forEach var = "result" items = "${list}">
id : ${result.id} <br>
number : ${result.num} <br>
address : ${result.address} <br>
<hr color = "gray">
</c:forEach>

</body>
</html>