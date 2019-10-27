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
	public void insert(String id, String pw, String tel, String name) throws Exception {//reqeust.get parameter�� �Ȱ��� ����
		System.out.println("insert ��û��");
		System.out.println("�Է��� id�� "+ id);
		System.out.println("�Է��� pw�� "+ pw);
		System.out.println("�Է��� name�� "+ name);
		System.out.println("�Է��� tel�� "+ tel);
		dao.insert(id, pw, name, tel);
	}
	
	@RequestMapping("select")
	public void select(String id, Model model) throws Exception {
		System.out.println("select ��û��");
		System.out.println("�˻��� id�� "+ id);
		MemberDTO dto2 = dao.select(id);
		//model��ü�� views������ ���� �ѱ�� ���� �� ���. (session�� ���������� �� ����.)
		model.addAttribute("dto2", dto2);
	}
	
	@RequestMapping("delete")
	public void delete(String id) throws Exception {
		System.out.println("delete ��û��");
		System.out.println("���� id��"+ id);
		dao.delete(id);
	}

}
