package com.iu.start.bankbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import org.springframework.ui.Model;

import com.iu.start.bankmember.BankMemberDTO;
import com.iu.start.utill.DBConnector;

public class BookDAO implements BookDAO_1 {
	
	
	
	// BankBook table에 insert 
		// BOOKNUM : 현재시간을 밀리세컨즈로 변환해서 입력
		// BOOKSALE : 1 
	
	@Override
	public int setUpdate(BookDTO bookDTO) throws Exception {
//		Connection con = DBConnector.getConnection();
//		
//		String sql = "UPDATE BANKBOOK SET BOOKNAME = ?, BOOKRATE=? WHERE BOOKNUM= ? ";
//		PreparedStatement st = con.prepareStatement(sql);
//		
//		
//	
//		st.setString(1, bookDTO.getBookname());
//		st.setDouble(2, bookDTO.getBookrate());
//		st.setLong(3, bookDTO.getBooknum());
//		
//		
//		int result = st.executeUpdate();
//		
//		
//		DBConnector.disConnect(st, con);
		//return result;
		

	}
	@Override
	public int setBankBook(BookDTO bookDTO) throws Exception {
		
		Connection con = DBConnector.getConnection();
		Calendar cal = Calendar.getInstance();
		String sql = "INSERT INTO BANKBOOK VALUES (?,?,?,?) ";
		
		PreparedStatement st =con.prepareStatement(sql);
		
		
		 st.setLong(1,cal.getTimeInMillis()); 
		st.setString (2, bookDTO.getBookname());
		st.setDouble (3, bookDTO.getBookrate());
		st.setInt (4, 1);
		
		int result =st.executeUpdate();
		DBConnector.disConnect(st, con);
		
		return result;
	}
	
	
		
		

	
	//bankbook 모든 데이터를 조회 최신순으로 
	@Override
	public ArrayList<BookDTO> getlist() throws Exception {
		
		ArrayList<BookDTO> ar =new ArrayList<BookDTO>();
		
		
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM BANKBOOK ORDER BY BOOKNUM DESC";
		
		PreparedStatement st =con.prepareStatement(sql);
		
		
		ResultSet rs =st.executeQuery();
		
		while (rs.next()) {
			BookDTO bookDTO =new BookDTO();
			bookDTO.setBooknum(rs.getLong("BOOKNUM"));
			bookDTO.setBookname(rs.getString("BOOKNAME"));
			bookDTO.setBookrate(rs.getDouble("BOOKRATE"));
			bookDTO.setBooksale(rs.getInt("BOOKSALE"));
			
			ar.add(bookDTO);
			
			
		}
		
		
		DBConnector.disConnect(rs, st, con);
		
		return ar; 
		
		
	}


	

	// booknum의 값으로 조회 (1개 아니면 없음) 
	@Override
	public BookDTO getDetail (BookDTO bookDTO) throws Exception{
			
			//booknum의 값으로 검색하고 해당 내용만 조회
			Connection con = DBConnector.getConnection();
			BookDTO bookDTO2 = null;
			
			String sql = "SELECT * FROM BANKBOOK WHERE BOOKNUM  = ?";
			
			PreparedStatement st =con.prepareStatement(sql);
			
			st.setLong(1, bookDTO.getBooknum());
			
			ResultSet rs=st.executeQuery();
		       
			if (rs.next()) {
				
				 
				 bookDTO2 =new BookDTO();
				 bookDTO2.setBooknum(rs.getLong("BOOKNUM"));
				 bookDTO2.setBookname(rs.getString("BOOKNAME"));
				 bookDTO2.setBookrate(rs.getDouble("BOOKRATE"));
				 bookDTO2.setBooksale(rs.getInt("BOOKSALE"));
			
				
			}else {
				
				return bookDTO2;
			}
			
			DBConnector.disConnect(rs, st, con);
			return bookDTO2;

				
				
				
				
			}
	@Override
	public int setChangeSale(BookDTO bookDTO) throws Exception {
		Connection con = DBConnector.getConnection();
		String sql = "UPDATE BANKBOOK SET BOOKSALE = ? WHERE BOOKNUM = ?";
		PreparedStatement st = con.prepareStatement(sql);
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("일련번호 입력");
		if(bookDTO.getBooksale()==1) {
		st.setInt(1, 0);
		st.setLong(2, sc.nextLong());
		result = st.executeUpdate();
		result=0;
		}
		else {
			st.setInt(1, 1);
			st.setLong(2, sc.nextLong());
			result = st.executeUpdate();
			result=1;
		}
				
		return result;
	}

	
	public int setDelete (BookDTO bookDTO) throws Exception {
		
	Connection con = DBConnector.getConnection();
	
	String sql = "DELETE BANKBOOK WHERE BOOKNUM= ?";
	
	PreparedStatement st = con.prepareStatement(sql);
	
	st.setLong(1, bookDTO.getBooknum());
	
	
	int result = st.executeUpdate();
	
	DBConnector.disConnect(st, con);
	
	return result;
			
	}

}

	
			
		

			
