package com.iu.start.test.bank;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.start.bankbook.BookDTO;

@Controller // 이클래스는 Controller 역할이며, Container(생명주기(객체를 만들고 소멸)를 관리)에게 이클래스의 객체 생성을 위임  
@RequestMapping (value="/member/*") // 루드밑에 멤버로 시작하는 모든 것은 membercotroller로 들어오고 아래에  경로는 mapping + 주소
public class MemberCotroller {
	
	
		@Autowired
		private BankMemberService bankMemberService;
		
		
//		private BankMemberDAO bankMemberDAO;
		
//		private MemberDAO bankMemberDAO;
		
//	 	@Autowired
//		public MemberCotroller (BankMemberDAO bankMemberDAO) {
//			
//			this.bankMemberDAO = bankMemberDAO();
//		}
	
	
	
	@RequestMapping(value="logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		//session소멸
		
		session.invalidate(); // session 죽이고 새로운 session 생성
		
		return "redirect:../";
		
	}
	
	
	
	
//	/member/login 해당 url이 요청왔을때 실행하는 매서드 생성
	//annotation => @ :설명 + 실행하라는 의미
	
	@RequestMapping (value = "login.aa", method =RequestMethod.GET )
	public void login() throws Exception {
		System.out.println("로그인 실행");
		
		
	}

	@RequestMapping (value ="login.aa",method =RequestMethod.POST) // 절대경로작성 
		//MAPPING: 어떤 URL이 들어오면 MAPPING함
	public String login(HttpSession session,BankMemberDTO bankMemberDTO, Model model ) throws Exception {
		
		System.out.println( "db에 로그인 성공" );	// login요청이 발생했을때 메서드에 실행 
//			BankMemberDAO bankMemberDAO =new BankMemberDAO();
			bankMemberDTO = bankMemberService.getLogin(bankMemberDTO);// 아이디 페스워드 입력하고 db 조회
			System.out.println(bankMemberDTO);
		// redirect: 다시 접속할 url 주소 (절대경로, 상대경로)"
		//	model.addAttribute("member", bankMemberDTO);
			  //HttpSession session= request.getSession();
        session.setAttribute("member", bankMemberDTO);
		return "redirect:../"; 
		//포어드를 하면 주소가 꼬여서 REDIRECT를 해줌 
		//그런데 URL 주소로 응답으로 나가버림 그럼 리퀘,리폰이 소멸됨(모델도 소멸= NULL) 
		
		
	}

	// 메서드 join url: /member/join
	//GET
	//get,poset 구분 :METHOD를 써줌
	
	@RequestMapping (value="join.aa", method= RequestMethod.GET)
	// 공동주소 생략가능 
	public String join() {
		
		System.out.println("조인 GET 실행 ");
		System.out.println("GET");
		return"member/join";
	}

	// 메서드 join url: /member/join
	//POST	
	@RequestMapping (value="join.aa", method = RequestMethod.POST)
//	public String join(String username, String password, String name, String Email, String phone) throws Exception {
	public String join(BankMemberDTO bankMemberDTO) throws Exception {
							//dto로 받는 변수이 set으로 받아져서 생략됨 
//		System.out.println(("name"));
		System.out.println("조인 POST 실행 ");
//		BankMemberDAO bankMemberDAO =new BankMemberDAO();
//		BankMemberDTO bankMemberDTO =new BankMemberDTO();
//		//String username=request.getParameter("username"); 
//		// => 대신 public String join(HttpServletRequest request)안에  파라미터와 동일한 이름으로 꺼내서 받아 줄 수 있음
//		// 동일한 이름으로 매개변수를 주면 request.getParameter를 지울 수 있음 
//	bankMemberDTO.setUserName("username");
//	// 본래 bankMemberDTO.setPasswoard(request.getParameter("password"));
//	bankMemberDTO.setPasswoard(("password"));
//	bankMemberDTO.setName(("name"));
//	bankMemberDTO.setEmail(("Email"));
//	bankMemberDTO.setPhone(("phone"));
		
		
	int result = bankMemberService.setjoin(bankMemberDTO);
	if(result==1) {
		System.out.println("성공");
		} else {
		System.out.println("실패");
			}
		
		
		//로그인폼 페이지로 이동
		//redirect
		return "redirect:./login.aa";
		
		//return"member/join";
	}
	

	//SEARCH 메서드명은 DAO의 메서드 명과 동일
		//member/search GET ID를 입력하는 폼
		//WEB-INF/views/member/search.jsp
		//ID를 입력해서 검색
		// /member/search POST /WEB-INF/views/member/list.jsp
	
	@RequestMapping(value ="search.aa", method = RequestMethod.GET) 
	public void getSearchByID() throws Exception {
		
		System.out.println("search");
		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("member/list");
//		return mv; //"member/list";		
				
	}
	
	@RequestMapping(value ="search.aa", method = RequestMethod.POST)
	public ModelAndView getSearchByID(String search, Model model ) throws Exception {
		System.out.println("cc");
//	BankMemberDAO bankMemberDAO =new BankMemberDAO();
	ArrayList<BankMemberDTO> ar =bankMemberService.getsearchbyID(search);
	model.addAttribute("list", ar);
	ModelAndView mv = new  ModelAndView();
	mv.setViewName("/member/list");
	//return "member/list";
	return mv;
	}
	
}