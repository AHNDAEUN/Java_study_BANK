package com.iu.start.homeWork;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value ="/homework/*") 
public class HomeWorkController {
	
	
	@RequestMapping(value ="list.aa", method = RequestMethod.GET)
		public void list(Model model) throws Exception {
		HomeWorkDAO homeWorkDAO =new HomeWorkDAO();
			ArrayList<HomeWorkDTO> ar = homeWorkDAO.boardList();
			System.out.println("상품목록 실행");
			System.out.println(homeWorkDAO.boardList());
			
			model.addAttribute("list", ar);
			
		}
		
		@RequestMapping(value="detail.aa", method= RequestMethod.GET)
	public ModelAndView detail(HomeWorkDTO homeWorkDTO) throws Exception {

			
			ModelAndView mv =new ModelAndView();
			System.out.println(" 상세 페이지 실행 ");
			HomeWorkDAO homeWorkDAO =new HomeWorkDAO();
			System.out.println(homeWorkDTO.getBoardName());
			homeWorkDTO= homeWorkDAO.boardDetail(homeWorkDTO);
			mv.setViewName("homework/detail.aa");
			mv.addObject( "board", homeWorkDTO);
			return mv;		
		
	}
	
		
		
		
		
	}

