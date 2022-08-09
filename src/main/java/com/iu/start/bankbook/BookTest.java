package com.iu.start.bankbook;

import java.util.Calendar;

public class BookTest {

	public static void main(String[] args) {


		BookDAO bookDAO =new BookDAO();
		BookDTO bookDTO =new BookDTO();
		
		
		try {
			
			bookDTO.setBookNum(Calendar.MILLISECOND);
			bookDTO.setBookName("name2");
			bookDTO.setBookRate(3.24);
			bookDTO.setBookSale(0);
			
		int result = bookDAO.setBankBook(bookDTO);
			System.out.println(result ==1 );
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
}
