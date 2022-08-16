package com.iu.start.bankAccount;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.start.test.bank.BankMemberDTO;
@Controller
@RequestMapping(value = "/account/*")

public class AccountController {
	//컨트롤러 멤버변수 선언
	private AccountDAO accountDAO;
	
	
	// 생성자 (defualt)
	public AccountController() {
		this.accountDAO =new AccountDAO();
	}
	

	//add 메서드 실행
	// ./account
	@RequestMapping(value = "add.aa", method = RequestMethod.GET ) 
	//속성이 2개 일때 VALUE를 명시해야하고 단독이면 생략해도됨
	//주소는 카멜 표기법 ex) bankAccount 식으로 
	public String add(HttpSession session,AccountDTO accountDTO) throws Exception{
		//DTO : USERNAME, BANKNUM-숫자가 클라이언트에서 보내줘야하기 때문에 파라미터로 받음
		System.out.println(" account add 실행");
		System.out.println(accountDTO.getBookNum());
		//int result = this.accountDAO.add(null);
		//parameter가 잘넘어오는지 알아보기 위해 getbooknum으로 확인
		
		//로그인한 사용자의 정보 꺼내오기 session
		
		BankMemberDTO bankMemberDTO =  (BankMemberDTO) session.getAttribute("member");
		//오류가 뜨는 이유는 모든 오브젝트는 
		//로그인한 정보를 꺼내기위해 member에서 가져옴
		accountDTO.setUserName(bankMemberDTO.getUserName());
		int result = this.accountDAO.add(accountDTO);
		
		return "redirect../bankbook/list.aa";
		//../ bankbook으로 가야하는데 현재위치가 account이기 때문에 
		
		
	}
}
