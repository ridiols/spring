<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>댓글확인 페이지</title>
<script type="text/javascript" src = "resources/js/jquery-3.4.1.js"> </script>
<script type ="text/javascript" >
	$(function() {	
		$('.btn1').click(function(){

			$.ajax({
				url : "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fent.xml&api_key=podicodolldusdajdcp5pkhaxc0a0yt9kveke3zw",
				data : {
					url : "http://www.chosun.com/site/data/rss/ent.xml",
					api_key : "podicodolldusdajdcp5pkhaxc0a0yt9kveke3zw",
					count : 20
					
				},
				success : function(result) {
					alert("조선일보 사이트와 연결 성공!");
					alert(result);
				}	
			});
			});		
	});

</script>
</head>
<body>
<input type ="button" class = "btn1" value ="신문기사 긁어오기"><br>
<div class = "d1"> </div>
</body>
</html>