package com.douzone.guestbook.dao.test;

import java.util.List;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
//		insertTest();
//		findAllTest();
		deleteTest();
	}



	private static void insertTest() {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("김수형");
		vo.setPassword("9999");
		vo.setMessage("반갑소");
		
		new GuestbookDao().insert(vo);
	}

	private static void findAllTest() {
		List<GuestbookVo> list = new GuestbookDao().findAll();
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
	}
	
	private static void deleteTest() {
		GuestbookDao dao = new GuestbookDao();
		dao.delete(2L, "9999");
		
	}

}
