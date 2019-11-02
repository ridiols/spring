package com.kgitbank.mvc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

@Repository
public class BookmarkDAO_old {
	
	
	public void insert(BookmarkDTO dto) throws Exception {
		
		/* DB 연결 경로
		 1. DB드라이버(커넥터 설정)
		 2. DB연결(DB주소, id, pw필요)
		 3. DB는 자바언어는 못 읽고 sql문만 읽으므로, SQL문 생성
		 4. SQL문 전송
		 5. 검색인 경우에는 받은 데이터 처리
		 */
				
		 //1. DB드라이버(커넥터 설정)
		Class.forName("com.mysql.jdbc.Driver");//드라이버 등록
		System.out.println("1.드라이버 설정 성공");
		//2. DB연결(DB주소, id, pw필요)
		String url ="jdbc:mysql://localhost:3308/spring";
		String user ="root";
		String password ="1234";
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("2.DB 연결 성공");
		//--여기까지 DBCP라이브러리 
		//3. SQL문 생성
		String sql ="insert into sitelist values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql); //con이라는 변수명을 통해서 
		ps.setString(1,dto.getNum());
		ps.setString(2,dto.getId());
		ps.setString(3,dto.getAddress());
		System.out.println("3.SQL문 생성 성공");
		//--여기까지 MyBatis
		//4. SQL문 전송
		ps.executeUpdate();
		System.out.println("4.SQL문 전송 성공");
		//5. 검색인 경우에는 받은 데이터 처리
		//이 과정을 1~3번까지 한꺼번에 묶어놓은 코드 라이브러리 = 마이바티스 
		//
	}

}
