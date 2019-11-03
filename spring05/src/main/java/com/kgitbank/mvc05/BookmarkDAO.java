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
		/* DB 연결 경로
		 1. DB드라이버(커넥터 설정)
		 2. DB연결(DB주소, id, pw필요)
		 3. DB는 자바언어는 못 읽고 sql문만 읽으므로, SQL문 생성
		 4. SQL문 전송
		 5. 검색인 경우에는 받은 데이터 처리
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
	
	public List<BookmarkDTO> selectAll() throws Exception {  //List<BookmarkDTO>으로 업캐스팅 시켜놓는 것이 ArrayList보다좋다. 이후 수정하기 편하기 때문에 
		return my.selectList("book.selectAll"); //MyBatis의 selectLis
	}
}
