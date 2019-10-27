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
		//1. btn 이라는 클래스의 버튼을 누르면	
		//$('.btn').click(function() {  ;버튼을 누를 때마다 
		
		$('.id').keyup(function()  {// keyup은 손을뗄 떼마다 실행되는 기능 keydown은~을 누르면
			//2. class id,pw의 값을 가지고오세요.
			idValue = $('.id').val();
			//pwValue = $('.pw').val();
			//3. id, pw값 확인 출력  input만 val 로 받고 태그와 태그 사이는 text로 받는다.
			//console.log('입력한 id는 ' + idValue)
			//console.log('입력한 pw는 ' + pwValue)
			//console.log('입력한 id의 길이는' + idValue.length)
			if(idValue.length>=5){
					
				$('.d1').text('아이디의 길이가 적절합니다.')
			}else{							
				<style> $('.d1').text('입력한 id가 너무 짧습니다. 5글자 이상 입력해주세요.')
				
				}	
		// 이와 같은 방법은 직접 서버를 들어가서 확인하는 것이 아니기 때문에 서버의 메모리 값을 아낄 수 있다. 
	}); //keyup end
	});// $ end
</script>
</head>
<body>
오늘은 3일차입니다.<br>
아이디를 입력해주세요 : <input type= "text" name="id" class="id"><br>  <!-- 여기서 name 값은 자바스크립트가 사용하지 않는다. -->

<div class="d1" style="color:red;"> </div><br>


</body>
</html>