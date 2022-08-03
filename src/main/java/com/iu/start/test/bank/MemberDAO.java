package com.iu.start.test.bank;

import java.util.ArrayList;

public interface MemberDAO {
	
	
	//bankmembers 회원가입 (인서트)
	public int setjoin(BankMemberDTO bankDTO)throws Exception;
	//메서드의 선언부 

	// 검색어를 입력해서 ID를 찾기  (검색어로 찾는 id는 키워드와 일치하면 여러명이 나올 수 있음)
	//찾으면 ABC 순으로 정렬 
	
	public ArrayList<BankMemberDTO> getsearchbyID (String search) throws Exception;
	
	
	
}
