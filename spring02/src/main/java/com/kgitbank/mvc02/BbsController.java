package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	@Autowired
	BbsDAO dao;
	
	@RequestMapping("bbsinsert")
	public void insert(String id, String title, String content, String writer) throws Exception {//reqeust.get parameter와 똑같은 개념
		System.out.println("bbsinsert 요청됨");
		System.out.println("입력한 id는 "+ id);
		System.out.println("입력한 title은 "+ title);
		System.out.println("입력한 content는 "+ content);
		System.out.println("입력한 writer는 "+ writer);
		dao.bbsinsert(id, title, content, writer);
	}
	
	
	@RequestMapping("bbsdelete")
	public void insert(String title) throws Exception {//reqeust.get parameter와 똑같은 개념
		System.out.println("bbsdelet 요청됨");
		System.out.println("삭제되는 글은 "+ title);
		dao.bbsdelete(title);
	}


}
