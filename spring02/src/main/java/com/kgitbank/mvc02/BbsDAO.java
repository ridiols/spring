package com.kgitbank.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	public void bbsinsert(String id, String writer, String title, String content) throws Exception {
		//Model(MVC 중)
				Class.forName("com.mysql.jdbc.Driver");
			//View(MVC 중)
				System.out.print("1.드라이버 설정 성공!");
				
				String url = "jdbc:mysql://localhost:3307/spring";
				String user = "root"; //id
				String password = "1234"; // pw
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.print("2.DB연결 성공!");
				
				String sql = "insert into bbs values(?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, id);
				ps.setString(2, title);
				ps.setString(3, content);
				ps.setString(4, writer);
				
				System.out.print("3.SQL 전송 성공!");
				
				ps.executeUpdate(); 
				System.out.print("4.SQL 전송 성공! ");
		
	}
	
	
	public void bbsdelete(String id) throws Exception {
		//Model(MVC 중)
				Class.forName("com.mysql.jdbc.Driver");
			//View(MVC 중)
				System.out.print("1.드라이버 설정 성공!");
				
				String url = "jdbc:mysql://localhost:3307/spring";
				String user = "root"; //id
				String password = "1234"; // pw
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.print("2.DB연결 성공!");
				
				String sql = "delete from bbs where id=?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, id);
				
				
				
				System.out.print("3.SQL 전송 성공!");
				
				ps.executeUpdate(); 
				System.out.print("4.SQL 전송 성공! ");
		
	}

}
