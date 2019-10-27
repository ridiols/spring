package com.kgitbank.mvc03;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;


@Repository
public class MemberDAO {

	
	public void insert(MemberDTO dto) throws Exception {
	//Model(MVC 중)
		Class.forName("com.mysql.jdbc.Driver");
	//View(MVC 중)
		System.out.print("1.드라이버 설정 성공!");
		
		String url = "jdbc:mysql://localhost:3307/spring";
		String user = "root"; //id
		String password = "1234"; // pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2.DB연결 성공!");
		
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		System.out.print("3.SQL 전송 성공!");
		
		ps.executeUpdate(); 
		System.out.print("4.SQL 전송 성공! ");
	}
	
	public void delete(MemberDTO dto) throws Exception {		
	//Model(MVC 중)
		Class.forName("com.mysql.jdbc.Driver");
	//View(MVC 중)
		System.out.print("1.드라이버 설정 성공!");
		
		String url = "jdbc:mysql://localhost:3307/spring";
		String user = "root"; //id
		String password = "1234"; // pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2.DB연결 성공!");
		
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		System.out.print("3.SQL 전송 성공!");
		
		ps.executeUpdate(); 
		System.out.print("4.SQL 전송 성공! ");
	}
	
	public MemberDTO select(MemberDTO dto) throws Exception {		
	//Model(MVC 중)
		Class.forName("com.mysql.jdbc.Driver");
	//View(MVC 중)
		System.out.print("1.드라이버 설정 성공!");
		
		String url = "jdbc:mysql://localhost:3307/spring";
		String user = "root"; //id
		String password = "1234"; // pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2.DB연결 성공!");
		
		String sql = "select * from member where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		System.out.print("3.SQL 전송 성공!");
		
		ResultSet rs = ps.executeQuery(); 
		
		MemberDTO dto2 = null; //지역변수 선언. 글로벌변수가아니고 지역변수 이므로 예외의상황을 방지하기 위해 기본적으로 초기화를 시켜주는 것이좋다.  
		if(rs.next()) { //검색 결과가 있는지 체크, 있다면 출력하라 
			String gid =rs.getString(1); //컬럼의 번호
			String pw =rs.getString(2);
			String name=rs.getString(3);
			String tel =rs.getString(4);
			System.out.println(gid);
			System.out.println(pw);
			System.out.println(name);
			System.out.println(tel);

			dto2 = new MemberDTO(); //위에서 지역변수로 선언 되었으므로 다시 할 수 없다. 
			dto2.setId(gid);
			dto2.setPw(pw);
			dto2.setName(name);
			dto2.setTel(tel);
			
		}
		System.out.print("4.SQL 전송 성공! ");
		return dto2;
		
	}
	
	
}
