package com.iu.start.bankAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;



public class AccountDAO {
	
	public int add(AccountDTO accountDTO) throws Exception {
		//int = insert
		
		// DB 연결
		
//		Connection con = DBConnector.getConnection();
		
		//SQL문 작성
//		String sql = "INSERT INTO BANKACCOUNT"
//				+ "VALUES (ACCOUNT_SQL_NEXTVAL, ? ,?, sysdate)"; 
		// 사용자가 보내는 데이터를 받아함 가입하려고하는 통장의 번호는  -parameter  
		//로그인한 유저아이디는 session에서 꺼내씀
		//미리보내기
		return 0;
		
//		PreparedStatement st= con.prepareStatement(sql);
		
		// ?세팅
		
//		st.setString(1, accountDTO.getUserName());
//		st.setInt(2, accountDTO.getBookNum());
//		
//		//최종 전송 후 결과 처리
//		
//		int result = st.executeUpdate();
//		
//		//연결 해제
//		DBConnector.disConnect(st, con);
		
//		return result;
		
		
	}

}
