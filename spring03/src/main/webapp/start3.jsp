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
		$('.btn').click(function() {
			//2. class id,pw�� ���� �����������.
			idValue = $('.id').val();
			pwValue = $('.pw').val();
			//3. id, pw�� Ȯ�� ���
			console.log('�Է��� id�� ' + idValue)
			console.log('�Է��� pw�� ' + pwValue)
			console.log('�Է��� id�� ���̴�' + idValue.length)
			
			
			if(idValue.length>=5){
				location.href="insert.do" 
			}else{
				alert('�Է��� id�� �ʹ� ª���ϴ�. �ټ����� �̻� �Է����ּ���.')				
			}		});
		
		// �̿� ���� ����� ���� ������ ���� Ȯ���ϴ� ���� �ƴϱ� ������ ������ �޸� ���� �Ƴ� �� �ִ�. 
		
	});
</script>
</head>
<body>
������ 3�����Դϴ�.<br>
<form action = "insert.do">
���̵� �Է����ּ��� : <input type= "text" name="id" class="id"><br>  <!-- ���⼭ name ���� �ڹٽ�ũ��Ʈ�� ������� �ʴ´�. -->
�н����带 �Է����ּ��� : <input type= "text" name="pw" class="pw"><br>

<input type= "submit" value="�Է°� üũ" class="btn">
</form>
</body>
</html>