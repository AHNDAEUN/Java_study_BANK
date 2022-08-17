package com.iu.start.bankmember;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankMemberService {
	
	@Autowired
	private BankMemberDAO bankMemberDAO;
	
	
	public BankMemberDTO getLogin(BankMemberDTO bankMemberDTO) throws Exception{
		
		return bankMemberDAO.getLogin(bankMemberDTO);
		
	}

	
	public int setjoin(BankMemberDTO bankDTO)throws Exception{
		
		return bankMemberDAO.setjoin(bankDTO);

	} 	
	
	public List<BankMemberDTO> getsearchbyID (String search) throws Exception{
		

		return bankMemberDAO.getsearchbyID(search);
		
	}
	
	

}
