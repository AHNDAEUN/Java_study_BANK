package com.iu.start.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.start.test.bank.BankMemberDTO;
import com.iu.start.utill.DBConnector;

public class BookDAO {
	
	
	
	// BankBook table에 insert 
		// BOOKNUM : 현재시간을 밀리세컨즈로 변환해서 입력
		// BOOKSALE : 1 
	
	public int setBankBook(BookDTO bookDTO) throws Exception {
		
		BookDTO bookDTO2 =new BookDTO();
		Connection con = DBConnector.getConnection();
		
		String sql = "INSERT INTO BANKBOOK VALUSE (?,?,?,?) ";
		
		PreparedStatement st =con.prepareStatement(sql);
		
		
		int result =st.executeUpdate();
		
		
		 st.setLong(1, bookDTO.getBookNum()); 
		st.setString (2, bookDTO.getBookName());
		st.setDouble (3, bookDTO.getBookRate());
		st.setInt (4, bookDTO.getBookSale());
		
		DBConnector.disConnect(st, con);
		
		return result;

	}
	
	//bankbook 모든 데이터를 조회 최신순으로 
	public ArrayList<BookDTO> getlist() throws Exception {
		
		ArrayList<BookDTO> ar =new ArrayList();
		
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM BANKBOOK ORDER BY BOOKNUM DESC";
		
		PreparedStatement st =con.prepareStatement(sql);
		
		
		ResultSet rs =st.executeQuery();
		
		while (rs.next()) {
			BookDTO bookDTO =new BookDTO();
			bookDTO.setBookNum(rs.getInt(1));
			bookDTO.setBookName(rs.getString(2));
			bookDTO.setBookRate(rs.getDouble(3));
			bookDTO.setBookSale(rs.getInt(4));
			
			ar.add(bookDTO);
			
			
		}
		
		
		DBConnector.disConnect(rs, st, con);
		
		return ar; 
		
		
	}


	

	// booknum의 값으로 조회 (1개 아니면 없음) 
			public BookDTO getDetail (BookDTO bookDTO) throws Exception{
	
				BookDTO bookDTO2 =new BookDTO();
			Connection con = DBConnector.getConnection();
			
			String sql = "SELECT * FROM BANKBOOK WHERE BOOKNUM  = ?";
			
			PreparedStatement st =con.prepareStatement(sql);
			
			st.setLong(1, bookDTO.getBookNum());
			
			ResultSet rs=st.executeQuery();
		       
			if (rs.next()) {
				
				 bookDTO2 =new BookDTO();
				 
				 bookDTO2.setBookNum(rs.getLong("BOOKNUM"));
				 bookDTO2.setBookName(sql);
			
				return bookDTO2; 
			}

				
				
				
				
			}
			}
			
			
		

			
