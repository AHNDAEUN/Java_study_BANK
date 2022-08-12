package com.iu.start.test.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Membertest {

	public static void main(String[] args) {
		BankMemberDAO bankMemberDAO = new BankMemberDAO();
		Scanner sc = new Scanner(System.in);
		BankMemberDTO bankMemberDTO = new BankMemberDTO();
		ArrayList<BankMemberDTO> ar = new ArrayList();
		
//		bankMembersDTO.setUsername("user890");
//		bankMembersDTO.setPassward("12345");
//		bankMembersDTO.setName("name890");
//		bankMembersDTO.setEmail("890890@naver.com");
//		bankMembersDTO.setPhone("010-7940-5612");
//				
//		try {
//			int result = bankMembersDAO.setJoin(bankMembersDTO);
//			if(result != 0) {
//				System.out.println("회원 가입 성공");
//			} 			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("회원 가입 실패");
//			e.printStackTrace();
//		}
//		
		try {
			System.out.println("검색어를 입력하세요");
			String search = sc.next();
			
			ar = bankMemberDAO.getsearchbyID(search);
				for(BankMemberDTO b: ar) {
				System.out.println("USERNAME: "+b.getUsername());
				System.out.println("PASSWORD: "+b.getPassword());
				System.out.println("NAME: "+b.getName());
				System.out.println("EMAIL: "+b.getEmail());
				System.out.println("PHONE: "+b.getPhone());
					}
				if(ar.size()==0) {
					System.out.println("검색 실패");
				}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

