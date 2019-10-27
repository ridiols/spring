<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>bbsJQuery페이지</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js" ></script>
<script type="text/javascript"> 
	$(function() {
		//1. btn 이라는 클래스의 버튼을 누르면	
		$('.btn').click(function() {
			//2. class id,pw의 값을 가지고오세요.
			idValue = $('.id').val();
			titleValue = $('.title').val();
			contentValue = $('.content').val();
			writerValue = $('.writer').val();
			//3. id, pw값 확인 출력
			console.log('입력한 id는 ' + idValue)
			console.log('입력한 제목은 ' + titleValue)
			console.log('입력한 id의 길이는' + idValue.length)
			
			
			if(idValue.length>=5){
				location.href=("insert.do?id=" + idValue + "&title=" + titleValue + "&content=" + contentValue+ "&writer=" + writerValue )
			}else{
				alert('입력한 id가 너무 짧습니다. 다섯글자 이상 입력해주세요.')				
			}		});
		
		// 이와 같은 방법은 직접 서버를 들어가서 확인하는 것이 아니기 때문에 서버의 메모리 값을 아낄 수 있다. 
		
	});
</script>
</head>
<body>
BBS 예제문입니다.<br>
아이디를 입력해주세요 : <input type= "text" name="id" class="id"><br>  <!-- 여기서 name 값은 자바스크립트가 사용하지 않는다. -->
제목을 입력해주세요 : <input type= "text" name="title" class="title"><br>
내용을 입력해주세요 : <input type= "text" name="content" class="content"><br>
글쓴이를 입력해주세요 : <input type= "text" name="writer" class="writer"><br>

<input type= "submit" value="입력" class="btn">

</body>
</html>