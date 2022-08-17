//package com.iu.start.test;
//
//import java.sql.Connection;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import com.iu.start.bankmember.BankMemberDAO;
//import com.iu.start.bankmember.BankMemberDTO;
//import com.iu.start.utill.DBConnector;
//
//public class DBConnectionTest {
//
//
//	public static void main(String[] args) {
//		
//		
//		BankMemberDTO bankMemberDTO = new BankMemberDTO();
//		BankMemberDAO bankMemberDAO =new BankMemberDAO();
//		Scanner sc = new Scanner(System.in);
//		ArrayList<BankMemberDTO> ar = new ArrayList();
//
//
////		 try {
////	         Connection con = DBConnector.getConnection();
////	      
////	         System.out.println(con != null);
//	         
//	         
//	         
////			1. db 연결해서 데이터값 넣기 
////	         bankMemberDTO.setUserName("user3");
////	         bankMemberDTO.setPasswoard("pw3");
////	         bankMemberDTO.setName("name3");
////	         bankMemberDTO.setEmail("f@naver.com");
////	         bankMemberDTO.setPhone("010-1274-5638");
////	         
////	      int result = bankMemberDAO.setjoin(bankMemberDTO);
////	    		  
////	      System.out.println(result == 1 );
//	      
//	         
//	         // 검색어로 찾기 
////	         ArrayList<BankMemberDTO> ar =bankMemberDAO.getsearchbyID("U");
////				System.out.println(ar.size()>0); 
////	        
////	         
////	         
////	      } catch (Exception e) {
////	         // TODO Auto-generated catch block
////	         e.printStackTrace();
////	      }
////	      
////		 try {
////				int result = bankMembersDAO.setJoin(bankMembersDTO);
////				if(result != 0) {
////					System.out.println("회원 가입 성공");
////				} 			
////			} catch (Exception e) {
////				// TODO Auto-generated catch block
////				System.out.println("회원 가입 실패");
////				e.printStackTrace();
////			}
//		 try {
//				System.out.println("검색어를 입력하세요");
//				String search = sc.next();
//				
//				ar = bankMemberDAO.getsearchbyID(search);
//					for(BankMemberDTO b: ar) {
//					System.out.println("USERNAME: "+b.getUsername());
//					System.out.println("PASSWORD: "+b.getPassword());
//					System.out.println("NAME: "+b.getName());
//					System.out.println("EMAIL: "+b.getEmail());
//					System.out.println("PHONE: "+b.getPhone());
//						}
//					if(ar.size()==0) {
//						System.out.println("검색 실패");
//					}
//				
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		
//	
//		 
//	
//}
//
//}
