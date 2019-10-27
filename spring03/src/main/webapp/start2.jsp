<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js" ></script>
<script type="text/javascript"> 
	$(function() {
		$('.answer').keyup(function()  {
			correct = 'apple'
			//quest ; 입력창을 만들어 실시간으로 정답인지 확인처리하기 
			answerValue = $('.answer').val();

			if(answerValue==correct){					
				$('.d1').text('정답입니다!')
			}else{							
				$('.d1').text('다시 도전해주세요.')	
				}	
	}); //keyup end
	});// $ end
</script>
</head>
<body>
사과를 영어로 하면 무엇일까요?<br>
답: <input type= "text" name="answer" class="answer"><br>  <!-- 여기서 name 값은 자바스크립트가 사용하지 않는다. -->

<div class="d1" style="color:red;"> </div><br>


</body>
</html>