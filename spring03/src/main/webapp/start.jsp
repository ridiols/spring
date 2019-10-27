<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css"/>

<script type="text/javascript" src="resources/js/jquery-3.4.1.js" ></script>
<script type="text/javascript"> 
	//jquery를 이용할 것이라는 선언
	//body를 먼저 읽고 자바스크립트를 실행시켜 주는 구문 
	$(function() {
	// input 에 입력한 데이터를 불러오는 구문 
	//*javascript는 ;를 넣어도 되고 넣지 않아도 된다.
	//*javascript는 오류가 있으면 그냥 실행이 안되어 버리고 디버깅 결과값을 보여주지 않는다. (해당 페이지 f12 > console 로 들어가야 한다)
	//var inputValueid = $('input').val() // 해당 데이터를 가져오고자 한다면, 변수명 = $(가지고올 변수태그명).val()
	var idValue = $('#id').val() 
	alert('입력되어 있는 id는' + idValue);

	var pwValue = $('#pw').val() //id는 #변수명
	alert('입력되어 있는 pw는' + pwValue);	
	var classValue =$('.in');
	
	// class 는 .변수명 ; in 이라는 클래스를불러오는 구문 
	//HTML 문의 요소들을 선택: 선택자(selector)
	//태그 ; 태그이름 , 
	//만약 변수가 두 개 이상이라면, 해당 변수를 받기 위해 1. 클래스를 가져오거나 2. id 값을 만들어주거나 두가지 방법이 있다.  // class는 변수값을 한꺼번에 처리할 때, id는 변수를 따로 관리할 때 사용한다.
	
	//alert('입력된 값은 inputValueid'+inputValueid)
	});
	

</script>
</head>
<body>
오늘은 3일차입니다.<br>
아이디를 입력해주세요 : <input type= "text" name="id" value ="root" id="id" class="in"><br>  <!-- 여기서 name 값은 자바스크립트가 사용하지 않는다. -->
패스워드를 입력해주세요 : <input type= "text" name="pw" value ="1234" id="pw" class="in"><br>

</body>
</html>