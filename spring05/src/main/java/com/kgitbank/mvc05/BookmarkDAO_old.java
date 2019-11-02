package com.kgitbank.mvc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

@Repository
public class BookmarkDAO_old {
	
	
	public void insert(BookmarkDTO dto) throws Exception {
		
		/* DB ���� ���
		 1. DB����̹�(Ŀ���� ����)
		 2. DB����(DB�ּ�, id, pw�ʿ�)
		 3. DB�� �ڹپ��� �� �а� sql���� �����Ƿ�, SQL�� ����
		 4. SQL�� ����
		 5. �˻��� ��쿡�� ���� ������ ó��
		 */
				
		 //1. DB����̹�(Ŀ���� ����)
		Class.forName("com.mysql.jdbc.Driver");//����̹� ���
		System.out.println("1.����̹� ���� ����");
		//2. DB����(DB�ּ�, id, pw�ʿ�)
		String url ="jdbc:mysql://localhost:3308/spring";
		String user ="root";
		String password ="1234";
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("2.DB ���� ����");
		//--������� DBCP���̺귯�� 
		//3. SQL�� ����
		String sql ="insert into sitelist values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql); //con�̶�� �������� ���ؼ� 
		ps.setString(1,dto.getNum());
		ps.setString(2,dto.getId());
		ps.setString(3,dto.getAddress());
		System.out.println("3.SQL�� ���� ����");
		//--������� MyBatis
		//4. SQL�� ����
		ps.executeUpdate();
		System.out.println("4.SQL�� ���� ����");
		//5. �˻��� ��쿡�� ���� ������ ó��
		//�� ������ 1~3������ �Ѳ����� ������� �ڵ� ���̺귯�� = ���̹�Ƽ�� 
		//
	}

}
