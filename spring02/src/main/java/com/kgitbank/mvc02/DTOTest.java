package com.kgitbank.mvc02;

public class DTOTest {

	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO();
		dto.setId("orange");
		dto.setPw("orange");
		dto.setName("orange");
		dto.setTel("orange");
		
		DTOGet send = new DTOGet();
		send.����(dto);
		
	}
}
