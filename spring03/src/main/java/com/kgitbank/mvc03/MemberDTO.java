package com.kgitbank.mvc03;


public class MemberDTO {
	//�۷ι� ���� ; �ڵ��ʱ�ȭ null�� �ʱ�ȭ ; 
	//������ 3���� ���� ; 1. �̹̾��� �� ������ ��ű� ����_������ ���� ; 2. �ʱ�ȭ���� - �������� (�۷ι� ����) �� �ڵ����� �ʱ�ȭ���°� �� 
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//set �޼��� , setter
	public void setId(String id) {
		this.id = id; //�Ȱ��� ���� �̸��̶�� ���������� �켱�̴�. ������ �Ű������� ���������� id�� �����Ѵٴ� ���� ǥ���ϱ� ���ؼ� ���� �������̶� ���� �޼����� �������� ǥ���ϱ� ���� this. �� �߰��� �ش�.
	}
	
	//get �޼���, getter
	public String getId() {
		return id;	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
