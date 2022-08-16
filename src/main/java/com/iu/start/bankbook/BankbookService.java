package com.iu.start.bankbook;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.iu.start.test.bank.BankMemberDTO;

public class BankbookService {
	
	
	@Autowired
	private BookDAO bookDAO;

public int setUpdate (BookDTO bookDTO) throws Exception{
	
	
	return bookDAO.setUpdate(bookDTO);
}
	
	
	public int setBankBook(BookDTO bookDTO) throws Exception{
		
		 return bookDAO.setBankBook(bookDTO);
	
	}
		
	
	public ArrayList<BookDTO> getlist()throws Exception{
		
		return bookDAO.getlist();
				
		
	}
		
	

		public int setChangeSale (BookDTO bookDTO)throws Exception{
			
			return bookDAO.setChangeSale(bookDTO);
		}
	

		
		public BookDTO getDetail (BookDTO bookDTO) throws Exception{
			
			return bookDAO.getDetail(bookDTO);
		}


		public int setDelete(BookDTO bookDTO) throws Exception {
			// TODO Auto-generated method stub
			return bookDAO.setDelete(bookDTO);
		}

}

	
	

