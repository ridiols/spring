package com.kgitbank.mvc03;


public class MemberDTO {
	//글로벌 변수 ; 자동초기화 null로 초기화 ; 
	//변수의 3가지 상태 ; 1. 이미쓰고 난 변수의 찌거기 상태_쓰레기 상태 ; 2. 초기화상태 - 전역변수 (글로벌 변수) 는 자동으로 초기화상태가 됨 
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	//set 메서드 , setter
	public void setId(String id) {
		this.id = id; //똑같은 변수 이름이라면 지역변수가 우선이다. 때문에 매개변수를 전역변수의 id에 대입한다는 것을 표기하기 위해서 같은 변수명이라도 위의 메서드의 변수임을 표기하기 위해 this. 를 추가해 준다.
	}
	
	//get 메서드, getter
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
