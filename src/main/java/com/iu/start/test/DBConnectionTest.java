package com.iu.start.test;

import java.sql.Connection;
import java.util.ArrayList;

import com.iu.start.test.bank.BankMemberDAO;
import com.iu.start.test.bank.BankMemberDTO;
import com.iu.start.utill.DBConnector;

public class DBConnectionTest {


	public static void main(String[] args) {
		
		
		BankMemberDTO bankMemberDTO = new BankMemberDTO();
		BankMemberDAO bankMemberDAO =new BankMemberDAO();
		

		 try {
	         Connection con = DBConnector.getConnection();
	      
	         System.out.println(con != null);
	         
	         
	         
//			1. db 연결해서 데이터값 넣기 
//	         bankMemberDTO.setUserName("user3");
//	         bankMemberDTO.setPasswoard("pw3");
//	         bankMemberDTO.setName("name3");
//	         bankMemberDTO.setEmail("f@naver.com");
//	         bankMemberDTO.setPhone("010-1274-5638");
//	         
//	      int result = bankMemberDAO.setjoin(bankMemberDTO);
//	    		  
//	      System.out.println(result ==1 );
	      
	         
	         // 검색어로 찾기 
	         ArrayList<BankMemberDTO> ar =bankMemberDAO.getsearchbyID("U");
				System.out.println(ar.size()>0); 
	        
	         
	         
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	      
		
		
		
	}

}
