package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("insert")
	public void insert(String id, String pw, String tel, String name) throws Exception {//reqeust.get parameter와 똑같은 개념
		System.out.println("insert 요청됨");
		System.out.println("입력한 id는 "+ id);
		System.out.println("입력한 pw는 "+ pw);
		System.out.println("입력한 name은 "+ name);
		System.out.println("입력한 tel은 "+ tel);
		dao.insert(id, pw, name, tel);
	}
	
	@RequestMapping("select")
	public void select(String id, Model model) throws Exception {
		System.out.println("select 요청됨");
		System.out.println("검색한 id는 "+ id);
		MemberDTO dto2 = dao.select(id);
		//model객체는 views까지만 값을 넘기고 싶을 때 사용. (session과 유사하지만 더 좁다.)
		model.addAttribute("dto2", dto2);
	}
	
	@RequestMapping("delete")
	public void delete(String id) throws Exception {
		System.out.println("delete 요청됨");
		System.out.println("지운 id는"+ id);
		dao.delete(id);
	}

}
