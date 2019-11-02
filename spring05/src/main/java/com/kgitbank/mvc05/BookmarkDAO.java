package com.kgitbank.mvc05;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookmarkDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(BookmarkDTO dto) throws Exception {
		my.insert("book.insert", dto);
		
		//해당 주소값
		
		/* DB 연결 경로
		 1. DB드라이버(커넥터 설정)
		 2. DB연결(DB주소, id, pw필요)
		 3. DB는 자바언어는 못 읽고 sql문만 읽으므로, SQL문 생성
		 4. SQL문 전송
		 5. 검색인 경우에는 받은 데이터 처리
		 */
				
	
	}

}
