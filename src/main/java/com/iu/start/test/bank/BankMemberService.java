package com.iu.start.test.bank;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankMemberService {
	
	@Autowired
	private BankMemberDAO bankMemberDAO;
	
	
	public BankMemberDTO getLogin(BankMemberDTO bankMemberDTO)  throws Exception{
		return bankMemberDAO.getLogin(bankMemberDTO);
	}
	
	
	
	
	//bankmembers 회원가입 (인서트)
	public int setjoin(BankMemberDTO bankMemberDTO)throws Exception{
		
		return bankMemberDAO.setjoin(bankMemberDTO);
	}
	//메서드의 선언부 

	// 검색어를 입력해서 ID를 찾기  (검색어로 찾는 id는 키워드와 일치하면 여러명이 나올 수 있음)
	//찾으면 ABC 순으로 정렬 
	
	public ArrayList<BankMemberDTO> getsearchbyID (String search) throws Exception{
		
		return bankMemberDAO.getsearchbyID(search);
	}

}
