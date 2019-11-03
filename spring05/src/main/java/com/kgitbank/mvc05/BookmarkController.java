package com.kgitbank.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookmarkController {
	
	@Autowired
	BookmarkDAO dao;

	@RequestMapping("insert")
	public void insert(BookmarkDTO bookMarkDTO) throws Exception {
		System.out.println(bookMarkDTO.getNum());
		System.out.println(bookMarkDTO.getId());
		System.out.println(bookMarkDTO.getAddress());
		dao.insert(bookMarkDTO);
	}
	
	@RequestMapping("update")
	public void update(BookmarkDTO bookMarkDTO) throws Exception {
		System.out.println(bookMarkDTO.getNum());
		System.out.println(bookMarkDTO.getId());
		System.out.println(bookMarkDTO.getAddress());
		dao.update(bookMarkDTO);
	}
	
	@RequestMapping("delete")
	public void delete(BookmarkDTO bookMarkDTO) throws Exception {
		System.out.println(bookMarkDTO.getNum());
		System.out.println(bookMarkDTO.getId());
		dao.delete(bookMarkDTO);
	}
		
	@RequestMapping("selectOne")
	public void selectOne(BookmarkDTO bookMarkDTO, Model model) throws Exception {
		System.out.println(bookMarkDTO.getNum());
		BookmarkDTO dto = dao.selectOne(bookMarkDTO);
		model.addAttribute("result", dto);
	}
	
	@RequestMapping("selectAll")
	public void selectAll(Model model) throws Exception {
		System.out.println("��ü �˻� ��û��");
		List<BookmarkDTO> list = dao.selectAll(); //���� dto�� list�� �ֱ� ������ ����ȯ�� ��Ű�� ���� ����, <BookmarkDTO>�� �־� ���Ҵ�. //
		model.addAttribute("list", list);
	}
	
}
