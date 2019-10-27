package com.kgitbank.mvc04;


import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("server.do")
	public void reply(String reply, String writer, Model model) throws Exception { //받아올 매개변수와 뷰로 들어갈 객체
		//JOptionPane.showMessageDialog(null,"보여주고싶은 말");
		model.addAttribute("reply",reply); //현재 DTO를 만들지 않았기 때문에 직접 MVC 중 모델을 직접 만들어 넘기는부분, reply model 을 연결해준다.
		model.addAttribute("writer",writer); //현재 DTO를 만들지 않았기 때문에 직접 MVC 중 모델을 직접 만들어 넘기는부분, reply model 을 연결해준다.
		dao.insert(reply,writer);
	}

}
