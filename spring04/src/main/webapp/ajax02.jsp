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
			//버튼을 클릭하면 입력한 값을가지고 온다.
			reValue = $('.reply').val() 
			$.ajax({
				url : "server.do",
				data : {
					reply : reValue // MAP_ hashmap 형태 
					
				}, //여러 개 데이터를 묶어줌 
				success : function(result) {
					alert("서버와 통신 성공!");
					$('.d1').append(result)
				}	
			});
	});		
	});

</script>
</head>
<body>

<div class ="d1"></div>
<input type ="text" class = "reply" name="reply"> <!-- 서버에게 통신하기 위해서 name값 저장 -->
<input type ="text" class = "writer" name="writer"> <!-- 서버에게 통신하기 위해서 name값 저장 -->
<input type ="button" class = "btn1" value ="댓글 달기"><br>
</body>
</html>