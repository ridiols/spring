<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���Ȯ�� ������</title>
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
					alert("�����Ϻ� ����Ʈ�� ���� ����!");
					alert(result);
				}	
			});
			});		
	});

</script>
</head>
<body>
<input type ="button" class = "btn1" value ="�Ź���� �ܾ����"><br>
<div class = "d1"> </div>
</body>
</html>