<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>bbsJQuery������</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js" ></script>
<script type="text/javascript"> 
	$(function() {
		//1. btn �̶�� Ŭ������ ��ư�� ������	
		$('.btn').click(function() {
			//2. class id,pw�� ���� �����������.
			idValue = $('.id').val();
			titleValue = $('.title').val();
			contentValue = $('.content').val();
			writerValue = $('.writer').val();
			//3. id, pw�� Ȯ�� ���
			console.log('�Է��� id�� ' + idValue)
			console.log('�Է��� ������ ' + titleValue)
			console.log('�Է��� id�� ���̴�' + idValue.length)
			
			
			if(idValue.length>=5){
				location.href=("insert.do?id=" + idValue + "&title=" + titleValue + "&content=" + contentValue+ "&writer=" + writerValue )
			}else{
				alert('�Է��� id�� �ʹ� ª���ϴ�. �ټ����� �̻� �Է����ּ���.')				
			}		});
		
		// �̿� ���� ����� ���� ������ ���� Ȯ���ϴ� ���� �ƴϱ� ������ ������ �޸� ���� �Ƴ� �� �ִ�. 
		
	});
</script>
</head>
<body>
BBS �������Դϴ�.<br>
���̵� �Է����ּ��� : <input type= "text" name="id" class="id"><br>  <!-- ���⼭ name ���� �ڹٽ�ũ��Ʈ�� ������� �ʴ´�. -->
������ �Է����ּ��� : <input type= "text" name="title" class="title"><br>
������ �Է����ּ��� : <input type= "text" name="content" class="content"><br>
�۾��̸� �Է����ּ��� : <input type= "text" name="writer" class="writer"><br>

<input type= "submit" value="�Է�" class="btn">

</body>
</html>