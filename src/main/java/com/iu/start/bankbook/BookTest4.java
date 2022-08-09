package com.iu.start.bankbook;

public class BookTest4 {

	public static void main(String[] args) {
		BookDAO bookDAO =new  BookDAO();
		BookDTO bookDTO = new BookDTO();
		
		try {
			bookDTO = bookDAO.getDetail(bookDTO);
			System.out.println(bookDTO != null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
