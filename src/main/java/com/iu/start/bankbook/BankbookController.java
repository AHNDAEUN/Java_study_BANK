package com.iu.start.bankbook;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.start.bankmember.BankMemberDTO;

@Controller
@RequestMapping(value ="/bankbook/*")
public class BankbookController {
	
		
		
		// /BANKBOOK/ LIST ,GET /LIST
		// BANKBOOK/ DETAIL, GET/ DETAIL 

	 	@RequestMapping(value ="list.aa", method = RequestMethod.GET)
		public void  list(Model model) throws Exception {
					
			System.out.println(" list 실행 ");
			
			BookDAO bookDAO = new BookDAO();
			ArrayList<BookDTO> ar = bookDAO.getlist();
		
			model.addAttribute("list",ar);
//			setAttribute("list", ar);
//			return "/bankbook/list";
			
		}
		
	 	@RequestMapping(value ="detail.aa", method = RequestMethod.GET)
		public ModelAndView detail(BookDTO bookDTO) throws Exception {	
			//public String detail(Long booknum, ModelAndView mv) {
			ModelAndView mv =new ModelAndView();
			System.out.println("detail 실행");
		
		//System.out.println("booknum:" +BookNum);
		//-------  console 메서드 실행 확인 

		BookDAO bookDAO =new BookDAO();
		System.out.println(bookDTO.getBookname());
		
		bookDTO= bookDAO.getDetail(bookDTO);
		System.out.println(bookDTO);
		//return "bankbook/detail"; jsp주소
		mv.setViewName("bankbook/detail");
		mv.addObject("dto",bookDTO);
		return mv;			
		}

		
		// /bankbook/add get/ /web-inf/view/bankbook/add.jsp
		@RequestMapping(value ="add.aa", method = RequestMethod.GET)
		public void add() throws Exception {
			
		System.out.println("add 실행");
		
		//return "/bankbook/add";
		}

		//  /bankbook/add post
		//name, rate
		@RequestMapping(value ="add.aa", method = RequestMethod.POST)
		//public String DBinsert(BookDTO bookDTO) throws Exception {
		public ModelAndView DBinsert(BookDTO bookDTO) throws Exception {
			
		System.out.println("add 실행");
		System.out.println(bookDTO.getBookname());
		System.out.println(bookDTO.getBookrate());

		
		BookDAO bookDAO = new BookDAO();

//	
//	Calendar ca = Calendar.getInstance();
//	Long num = ca.getTimeInMillis();
//	
//	bookDTO.setBookNum(num);
//	bookDTO.setBookSale(1);
		int result = bookDAO.setBankBook(bookDTO);
		if(result == 1) {
			
			System.out.println( "계좌 추가 실행");
		}
		
		//등록 후 페이지 이동 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:./list.aa");
		
		//return "/bankbook/add";
		return mv;
		
	
		
		}

		@RequestMapping(value ="update.aa", method = RequestMethod.GET) // 벨류가 뱅크북에 업데이트가 왔을때 메서드는 get이 왔을때 보냄
		public void update(BookDTO bookDTO, Model model ) throws Exception {
			//파마리터 처리방법 request(내장객체)선언 , dto선언, 보내고 싶은 객체 선언
			System.out.println("update 실행");
			
			// view 경로명을 주는 밥법 void = url주소 , 리턴으로 뷰의 경로를 스트링타입으로 담음, 모델앤뷰로 보내주기 
			
			// controller 조회
			BookDAO bookDAO =new BookDAO();
			
			//파마미터 출력
			 bookDTO= bookDAO.getDetail(bookDTO);
			 System.out.println(bookDTO.getBookname());
			 model.addAttribute("dto", bookDTO);
			
			
			
		}
		
//		@RequestMapping (value="update", method= RequestMethod.GET)
//		public ModelAndView update(BankBookDTO bankBookDTO) throws Exception {
//			System.out.println("update GET");
//			BankBookDAO bankBookDAO =new BankBookDAO();
//			bankBookDTO = bankBookDAO.getDetail(bankBookDTO);
//			System.out.println(bankBookDTO.getBooknum());
//			ModelAndView modelAndView = new ModelAndView();
//			modelAndView.addObject("update", bankBookDTO);
//			return modelAndView;
//		}
		
		@RequestMapping (value ="update.aa", method =RequestMethod.POST)
		public ModelAndView update (BookDTO bookDTO) throws Exception{
		
			System.out.println("update1 실행");
			
			BookDAO bookDAO = new BookDAO();
			ModelAndView mv =new ModelAndView(); //view 경로를 가지고 있음
			mv.setViewName("redirect:./update");
			int result = bookDAO.setUpdate(bookDTO);
			System.out.println( result== 1);
			
			if(result>0) {
				System.out.println("성공");
				mv.setViewName("redirect:./detail.aa?booknum="+bookDTO.getBooknum());
			}
			return mv;
			
			
			//등록 후 페이지 이동 
			//mv.setViewName("redirt:.list");
			
			//return "redirect:.detail?BookNum="+bookDTO.getBookNum(); 
			// 디테일갈때 메서드는 get 주소만 주고 파라미터를 
			//redirect:.detail 메서드이기 때문에 파라미터를 주려면 써줘야함 
			
			
		}
		
//		@RequestMapping(value = "delete", method=RequestMethod.GET)
//		public String delete(BookDTO bookDTO) throws Exception {
//			ModelAndView mv =new ModelAndView();
//			BookDAO bookDAO =new BookDAO();
//			
//			bookDAO.setDelete(bookDTO);
//			
//			int result = bookDAO.setDelete(bookDTO);
//			mv.setViewName("redirect:.list");
//			
//			return "redirect:.list";
		
		//bankbook/delete GET
		@RequestMapping (value="delete.aa", method=RequestMethod.GET)
		public ModelAndView delete(BookDTO bookDTO) throws Exception {
			System.out.println("delete");
			BookDAO bookDAO = new BookDAO();
			ModelAndView mv = new ModelAndView(); 
			int result = bookDAO.setDelete(bookDTO);
			System.out.println(result);
			if(result>0) {
				System.out.println("성공");
				mv.setViewName("redirect:./list.aa");
						}
			return mv;
			
		}
}
