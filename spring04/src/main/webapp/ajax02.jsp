<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���Ȯ�� ������</title>
<script type="text/javascript" src = "resources/js/jquery-3.4.1.js"> </script>
<script type ="text/javascript" >
	$(function() { //body ���� �ν��ϰ�, �ڹٽ�ũ��Ʈ�� �̿��� �ּ���.		
		$('.btn1').click(function(){
			//��ư�� Ŭ���ϸ� �Է��� ���������� �´�.
			reValue = $('.reply').val() 
			$.ajax({
				url : "server.do",
				data : {
					reply : reValue // MAP_ hashmap ���� 
					
				}, //���� �� �����͸� ������ 
				success : function(result) {
					alert("������ ��� ����!");
					$('.d1').append(result)
				}	
			});
	});		
	});

</script>
</head>
<body>

<div class ="d1"></div>
<input type ="text" class = "reply" name="reply"> <!-- �������� ����ϱ� ���ؼ� name�� ���� -->
<input type ="text" class = "writer" name="writer"> <!-- �������� ����ϱ� ���ؼ� name�� ���� -->
<input type ="button" class = "btn1" value ="��� �ޱ�"><br>
</body>
</html>