package com.iu.start.bankbook;

import java.util.ArrayList;


import com.iu.start.test.bank.BankMemberDTO;

public class BookTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookDAO bookDAO =new BookDAO();
		BookDTO bookDTO =new BookDTO();
		
		
		try {
			for(bookDTO b:ar) {
			
			ArrayList<BookDTO>ar = bookDAO.getlist();
			System.out.println(ar.size()>0);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	
	
}