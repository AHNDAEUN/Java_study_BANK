package com.iu.start.bankbook;

import java.util.ArrayList;

public interface BookDAO_1 {

	
	

	// BankBook table에 insert 
	// BOOKNUM : 현재시간을 밀리세컨즈로 변환해서 입력
	// BOOKSALE : 1 
	
	
	public int setBankBook(BookDTO) throws Exception;
		
	//bankbook 모든 데이터를 조회 최신순으로 
	public ArrayList<BookDTO> getlist()throws Exception;
		
	
	// Sale 컬럼 수정 
		public int setChangeSale ()throws Exception;  
		//인서트 업데이트 딜리트중에 

		// booknum의 값으로 조회 (1개 아니면 없음) 
		public BookDTO getDetail (BookDTO bookDTO) throws Exception;
}
