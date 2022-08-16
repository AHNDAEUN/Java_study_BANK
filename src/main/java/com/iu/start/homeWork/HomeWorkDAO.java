package com.iu.start.homeWork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.iu.start.bankbook.BookDTO;
import com.iu.start.utill.DBConnector;

public class HomeWorkDAO {
	
	
	public ArrayList<HomeWorkDTO> boardList() throws Exception{
		
		ArrayList<HomeWorkDTO> ar =new ArrayList<HomeWorkDTO>();
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM BOARD ORDER BY BOARDNUM DESC";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		
		ResultSet rs = st.executeQuery();
		
		
		while (rs.next()) {
			
			HomeWorkDTO homeWorkDTO = new HomeWorkDTO();
			homeWorkDTO.setBoardNum(rs.getLong("BOARDNUM"));
			homeWorkDTO.setBoardContent(rs.getString("BOARDSUBJECT"));
			homeWorkDTO.setBoardName(rs.getString("BOARDCONTENT"));
			homeWorkDTO.setBoardSubject(rs.getString("BOARDNAME"));
			homeWorkDTO.setBoardDate(rs.getDate("BOARDDATE"));
			homeWorkDTO.setBoardHit(rs.getInt("BOARDHIT"));
			ar.add(homeWorkDTO);
			
		}

		DBConnector.disConnect(rs, st, con);
		return ar;	
		
		
		
		
	}


			public HomeWorkDTO boardDetail( HomeWorkDTO homeWorkDTO) throws Exception {
			
			Connection con = DBConnector.getConnection();
			HomeWorkDTO homeWorkDTO2 =null;
			
			String sql ="SELECT * FROM BOARD WHERE BOARDNUM = ?";
			
			PreparedStatement st =con.prepareStatement(sql);
			
			st.setLong(1,homeWorkDTO.getBoardNum());
			
			ResultSet rs =st.executeQuery();
			
		
			
			if(rs.next()) {
				
				
				homeWorkDTO2 =new HomeWorkDTO();
				homeWorkDTO2.setBoardNum(rs.getLong("BOARDNUM"));
				homeWorkDTO2.setBoardSubject(rs.getString("BOARDSUBJECT"));
				homeWorkDTO2.setBoardContent(rs.getString("BOARDCONTENT"));
				homeWorkDTO2.setBoardName(rs.getString("BOARDNAME"));
				homeWorkDTO2.setBoardDate(rs.getDate("BOARDDATE"));
				homeWorkDTO2.setBoardHit(rs.getInt("BOARDHIT"));
				
			}else {
				
				return homeWorkDTO2;
			}
			
			
			DBConnector.disConnect(rs, st, con);
			
			return homeWorkDTO2;
	
}


}
