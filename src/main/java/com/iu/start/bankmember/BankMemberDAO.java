package com.iu.start.bankmember;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

@Repository
public class BankMemberDAO implements MemberDAO {
	
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.start.bankmember.BankMemberDAO.";
	
	public BankMemberDTO getLogin(BankMemberDTO bankMemberDTO) throws Exception{
	
//		Connection con = DBConnector.getConnection();
//		
//		String sql ="SELECT USERNAME, NAME FROM BANKMEMBERS WHERE USERNAME=? AND PASSWORD=?";
//		
//		PreparedStatement st= con.prepareStatement(sql);
//
//		
//		st.setString(1,bankMemberDTO.getUsername());
//		st.setString(2, bankMemberDTO.getPassword());
//		
//		ResultSet rs = st.executeQuery();
//		
//		if (rs.next()) {
//			
//			
//			bankMemberDTO =new BankMemberDTO();
//			bankMemberDTO.setUsername(rs.getString("USERNAME"));
//			bankMemberDTO.setName(rs.getString("NAME"));
//		}else {
//			bankMemberDTO =null;
//			//return null;
//			
//		}
//		DBConnector.disConnect(rs, st, con);
		return sqlSession.selectOne(NAMESPACE+"getLogin",bankMemberDTO);
	}
	
	public int setjoin (BankMemberDTO bankMemberDTO) throws Exception{
	
		
		
		//db연결
		
//		Connection con = DBConnector.getConnection();
//		
//		// SQL 작성
//		
//		String sql = "INSERT INTO BANKMEMBERS VALUES (?,?,?,?,?)";
//		
//		
//		// 미리전송
//		
//		PreparedStatement st = con.prepareStatement(sql);
//		
//		
//		st.setString(1, bankMemberDTO.getUsername());
//		st.setString(2, bankMemberDTO.getPassword());
//		st.setString(3, bankMemberDTO.getName());
//		st.setString(4, bankMemberDTO.getEmail());
//		st.setString(5, bankMemberDTO.getPhone());
//		
//	
//		
//		// 자원해제 		
//		int result = st.executeUpdate();
//
//		
//		
//		DBConnector.disConnect(st, con);
	
//		return result;
		
		return sqlSession.insert(NAMESPACE+"setjoin",bankMemberDTO);
	
}
	
	
	
	public List<BankMemberDTO> getsearchbyID(String search)throws Exception {

//		ArrayList<BankMemberDTO> ar =new ArrayList();
//		Scanner sc = new Scanner(System.in);
//		
//		Connection con = DBConnector.getConnection();
//		
//		String sql = "SELECT * FROM BANKMEMBERS WHERE USERNAME LIKE ? ORDER BY USERNAME ASC"; 
//		
//		// 포함하기 위해 %% 쓰면 %에 ''에 생기면서 에러가 뜸
//				// ||문자열을 합쳐주는 OR 연산자 '%'||?||'%"
//				//"%+ search +%" 2개중 하나로 해줌
//		
//		PreparedStatement st = con.prepareStatement(sql);
//		
//			st.setString(1, "%"+ search +"%");
//			 // 검색어는 매개변수 SEARCH로 받아온 것을 입력
//			ResultSet rs =st.executeQuery();
//			
//	
//			while(rs.next()){
//				BankMemberDTO bankMemberDTO1 = new BankMemberDTO(); 
//			 	
//		bankMemberDTO1.setUsername(rs.getString("USERNAME"));
//		bankMemberDTO1.setPassword(rs.getString("PASSWORD"));
//		bankMemberDTO1.setName(rs.getString("NAME"));
//		bankMemberDTO1.setEmail(rs.getString("EMAIL"));
//		 bankMemberDTO1.setPhone(rs.getString("HPONE"));
//			ar.add(bankMemberDTO1);
//			}
//	
//			
//			DBConnector.disConnect(rs, st, con);
			
			return sqlSession.selectList(NAMESPACE+"getsearchbyID", search);
			
	}
}
