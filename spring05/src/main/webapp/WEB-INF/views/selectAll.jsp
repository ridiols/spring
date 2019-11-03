<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 지시자 -->
<!-- url형태의 아이디, "http://java.sun.com/jsp/jstl/core" 는 다운로드 형태가아니라 id형태이다. jstl/core 은 여섯가지가 있는데 core 은 기본에 해당한다.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>검색 페이지</title>
</head>
<body>

결과 페이지입니다. <br>
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