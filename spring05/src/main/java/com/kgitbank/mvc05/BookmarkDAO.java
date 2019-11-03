package com.kgitbank.mvc05;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookmarkDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(BookmarkDTO bookMarkDTO) throws Exception {
		my.insert("book.insert", bookMarkDTO);
		/* DB ���� ���
		 1. DB����̹�(Ŀ���� ����)
		 2. DB����(DB�ּ�, id, pw�ʿ�)
		 3. DB�� �ڹپ��� �� �а� sql���� �����Ƿ�, SQL�� ����
		 4. SQL�� ����
		 5. �˻��� ��쿡�� ���� ������ ó��
		 */
	}

	public void update(BookmarkDTO bookMarkDTO) throws Exception {
		my.update("book.update", bookMarkDTO);
	}
	public void delete(BookmarkDTO bookMarkDTO) throws Exception {
		my.delete("book.delete", bookMarkDTO);
	}
	
	public BookmarkDTO selectOne(BookmarkDTO bookMarkDTO) throws Exception {
		return my.selectOne("book.selectOne", bookMarkDTO);
	}
	
	public List<BookmarkDTO> selectAll() throws Exception {  //List<BookmarkDTO>���� ��ĳ���� ���ѳ��� ���� ArrayList��������. ���� �����ϱ� ���ϱ� ������ 
		return my.selectList("book.selectAll"); //MyBatis�� selectLis
	}
}
