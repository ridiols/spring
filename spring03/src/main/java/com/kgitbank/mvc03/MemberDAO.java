package com.kgitbank.mvc03;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;


@Repository
public class MemberDAO {

	
	public void insert(MemberDTO dto) throws Exception {
	//Model(MVC ��)
		Class.forName("com.mysql.jdbc.Driver");
	//View(MVC ��)
		System.out.print("1.����̹� ���� ����!");
		
		String url = "jdbc:mysql://localhost:3307/spring";
		String user = "root"; //id
		String password = "1234"; // pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2.DB���� ����!");
		
		String sql = "insert into member values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
		System.out.print("3.SQL ���� ����!");
		
		ps.executeUpdate(); 
		System.out.print("4.SQL ���� ����! ");
	}
	
	public void delete(MemberDTO dto) throws Exception {		
	//Model(MVC ��)
		Class.forName("com.mysql.jdbc.Driver");
	//View(MVC ��)
		System.out.print("1.����̹� ���� ����!");
		
		String url = "jdbc:mysql://localhost:3307/spring";
		String user = "root"; //id
		String password = "1234"; // pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2.DB���� ����!");
		
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		System.out.print("3.SQL ���� ����!");
		
		ps.executeUpdate(); 
		System.out.print("4.SQL ���� ����! ");
	}
	
	public MemberDTO select(MemberDTO dto) throws Exception {		
	//Model(MVC ��)
		Class.forName("com.mysql.jdbc.Driver");
	//View(MVC ��)
		System.out.print("1.����̹� ���� ����!");
		
		String url = "jdbc:mysql://localhost:3307/spring";
		String user = "root"; //id
		String password = "1234"; // pw
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.print("2.DB���� ����!");
		
		String sql = "select * from member where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		System.out.print("3.SQL ���� ����!");
		
		ResultSet rs = ps.executeQuery(); 
		
		MemberDTO dto2 = null; //�������� ����. �۷ι��������ƴϰ� �������� �̹Ƿ� �����ǻ�Ȳ�� �����ϱ� ���� �⺻������ �ʱ�ȭ�� �����ִ� ��������.  
		if(rs.next()) { //�˻� ����� �ִ��� üũ, �ִٸ� ����϶� 
			String gid =rs.getString(1); //�÷��� ��ȣ
			String pw =rs.getString(2);
			String name=rs.getString(3);
			String tel =rs.getString(4);
			System.out.println(gid);
			System.out.println(pw);
			System.out.println(name);
			System.out.println(tel);

			dto2 = new MemberDTO(); //������ ���������� ���� �Ǿ����Ƿ� �ٽ� �� �� ����. 
			dto2.setId(gid);
			dto2.setPw(pw);
			dto2.setName(name);
			dto2.setTel(tel);
			
		}
		System.out.print("4.SQL ���� ����! ");
		return dto2;
		
	}
	
	
}
