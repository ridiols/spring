package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	@RequestMapping("bbsinsert")
	public void insert(String id, String title, String content, String writer) throws Exception {//reqeust.get parameter�� �Ȱ��� ����
		System.out.println("bbsinsert ��û��");
		System.out.println("�Է��� id�� "+ id);
		System.out.println("�Է��� title�� "+ title);
		System.out.println("�Է��� content�� "+ content);
		System.out.println("�Է��� writer�� "+ writer);
		dao.bbsinsert(id, title, content, writer);
	}
	
	
	@RequestMapping("bbsdelete")
	public void insert(String title) throws Exception {//reqeust.get parameter�� �Ȱ��� ����
		System.out.println("bbsdelet ��û��");
		System.out.println("�����Ǵ� ���� "+ title);
		dao.bbsdelete(title);
	}


}
