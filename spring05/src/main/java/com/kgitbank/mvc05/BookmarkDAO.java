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
		
		//�ش� �ּҰ�
		
		/* DB ���� ���
		 1. DB����̹�(Ŀ���� ����)
		 2. DB����(DB�ּ�, id, pw�ʿ�)
		 3. DB�� �ڹپ��� �� �а� sql���� �����Ƿ�, SQL�� ����
		 4. SQL�� ����
		 5. �˻��� ��쿡�� ���� ������ ó��
		 */
				
	
	}

}
