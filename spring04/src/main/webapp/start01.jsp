<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>댓글확인 페이지</title>
<script type="text/javascript" src = "resources/js/jquery-3.4.1.js"> </script>
<script type ="text/javascript" >
	$(function() { //body 먼저 인식하고, 자바스크립트를 이용해 주세요.
		
		$('.btn1').click(function(){
			console.log('이미지 추가 버튼 클릭됨');
			$('.d1').append('<img src=resources/img/coffee.jpg height=150>' )
	});
	
		$('.btn2').click(function(){
			console.log('텍스트 추가 버튼 클릭됨');
			$('.d1').append('<font color =blue> 아메리카노</font>')
			
	});
		
		
	});
			</script>
<!--  -->
</head>
<body>

<input type ="button" class = "btn1" value ="이미지 추가"><br>
<input type ="button" class = "btn2" value ="텍스트 추가"><br>

<div class ="d1"></div>


</body>
</html>