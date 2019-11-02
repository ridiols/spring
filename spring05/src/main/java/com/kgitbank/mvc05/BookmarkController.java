package com.kgitbank.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
}
