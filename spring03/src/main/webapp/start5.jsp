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
		//1. btn �̶�� Ŭ������ ��ư�� ������	
		//$('.btn').click(function() {  ;��ư�� ���� ������ 
		
		$('.id').keyup(function()  {// keyup�� ������ ������ ����Ǵ� ��� keydown��~�� ������
			//2. class id,pw�� ���� �����������.
			idValue = $('.id').val();
			//pwValue = $('.pw').val();
			//3. id, pw�� Ȯ�� ���  input�� val �� �ް� �±׿� �±� ���̴� text�� �޴´�.
			//console.log('�Է��� id�� ' + idValue)
			//console.log('�Է��� pw�� ' + pwValue)
			//console.log('�Է��� id�� ���̴�' + idValue.length)
			if(idValue.length>=5){
					
				$('.d1').text('���̵��� ���̰� �����մϴ�.')
			}else{							
				<style> $('.d1').text('�Է��� id�� �ʹ� ª���ϴ�. 5���� �̻� �Է����ּ���.')
				
				}	
		// �̿� ���� ����� ���� ������ ���� Ȯ���ϴ� ���� �ƴϱ� ������ ������ �޸� ���� �Ƴ� �� �ִ�. 
	}); //keyup end
	});// $ end
</script>
</head>
<body>
������ 3�����Դϴ�.<br>
���̵� �Է����ּ��� : <input type= "text" name="id" class="id"><br>  <!-- ���⼭ name ���� �ڹٽ�ũ��Ʈ�� ������� �ʴ´�. -->

<div class="d1" style="color:red;"> </div><br>


</body>
</html>