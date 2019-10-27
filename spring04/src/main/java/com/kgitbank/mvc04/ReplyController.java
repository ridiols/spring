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
	public void reply(String reply, String writer, Model model) throws Exception { //�޾ƿ� �Ű������� ��� �� ��ü
		//JOptionPane.showMessageDialog(null,"�����ְ���� ��");
		model.addAttribute("reply",reply); //���� DTO�� ������ �ʾұ� ������ ���� MVC �� ���� ���� ����� �ѱ�ºκ�, reply model �� �������ش�.
		model.addAttribute("writer",writer); //���� DTO�� ������ �ʾұ� ������ ���� MVC �� ���� ���� ����� �ѱ�ºκ�, reply model �� �������ش�.
		dao.insert(reply,writer);
	}

}
