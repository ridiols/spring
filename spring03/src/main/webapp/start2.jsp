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
			//quest ; �Է�â�� ����� �ǽð����� �������� Ȯ��ó���ϱ� 
			answerValue = $('.answer').val();

			if(answerValue==correct){					
				$('.d1').text('�����Դϴ�!')
			}else{							
				$('.d1').text('�ٽ� �������ּ���.')	
				}	
	}); //keyup end
	});// $ end
</script>
</head>
<body>
����� ����� �ϸ� �����ϱ��?<br>
��: <input type= "text" name="answer" class="answer"><br>  <!-- ���⼭ name ���� �ڹٽ�ũ��Ʈ�� ������� �ʴ´�. -->

<div class="d1" style="color:red;"> </div><br>


</body>
</html>