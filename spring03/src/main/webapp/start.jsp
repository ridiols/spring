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
	//jquery�� �̿��� ���̶�� ����
	//body�� ���� �а� �ڹٽ�ũ��Ʈ�� ������� �ִ� ���� 
	$(function() {
	// input �� �Է��� �����͸� �ҷ����� ���� 
	//*javascript�� ;�� �־ �ǰ� ���� �ʾƵ� �ȴ�.
	//*javascript�� ������ ������ �׳� ������ �ȵǾ� ������ ����� ������� �������� �ʴ´�. (�ش� ������ f12 > console �� ���� �Ѵ�)
	//var inputValueid = $('input').val() // �ش� �����͸� ���������� �Ѵٸ�, ������ = $(������� �����±׸�).val()
	var idValue = $('#id').val() 
	alert('�ԷµǾ� �ִ� id��' + idValue);

	var pwValue = $('#pw').val() //id�� #������
	alert('�ԷµǾ� �ִ� pw��' + pwValue);	
	var classValue =$('.in');
	
	// class �� .������ ; in �̶�� Ŭ�������ҷ����� ���� 
	//HTML ���� ��ҵ��� ����: ������(selector)
	//�±� ; �±��̸� , 
	//���� ������ �� �� �̻��̶��, �ش� ������ �ޱ� ���� 1. Ŭ������ �������ų� 2. id ���� ������ְų� �ΰ��� ����� �ִ�.  // class�� �������� �Ѳ����� ó���� ��, id�� ������ ���� ������ �� ����Ѵ�.
	
	//alert('�Էµ� ���� inputValueid'+inputValueid)
	});
	

</script>
</head>
<body>
������ 3�����Դϴ�.<br>
���̵� �Է����ּ��� : <input type= "text" name="id" value ="root" id="id" class="in"><br>  <!-- ���⼭ name ���� �ڹٽ�ũ��Ʈ�� ������� �ʴ´�. -->
�н����带 �Է����ּ��� : <input type= "text" name="pw" value ="1234" id="pw" class="in"><br>

</body>
</html>