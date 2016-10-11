package com.groupfive.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	@RequestMapping("/index")
	public ModelAndView home(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name") != null){
//			mv.addObject("name", request.getParameter("name"));
//		}//end if statement
		mv.setViewName("index");
		return mv;
	}//endModelAndView Home Page
	
	@RequestMapping("/banrhome")
	public ModelAndView banrhome(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name") != null){
//			mv.addObject("name", request.getParameter("name"));
//		}//end if statement
		mv.setViewName("banrhome");
		return mv;
	}//endModelAndView Developer Contact Page
	
	@RequestMapping("/edituser")
	public ModelAndView edituser(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name") != null){
//			mv.addObject("name", request.getParameter("name"));
//		}//end if statement
		mv.setViewName("edituser");
		return mv;
	}//endModelAndView Developer Contact Page
	
	@RequestMapping("/addlater")
	public ModelAndView addlater(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name") != null){
//			mv.addObject("name", request.getParameter("name"));
//		}//end if statement
		mv.setViewName("addlater");
		return mv;
	}//endModelAndView Developer Contact Page
	

	
	@RequestMapping("/developercontact")
	public ModelAndView developercontact(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name") != null){
//			mv.addObject("name", request.getParameter("name"));
//		}//end if statement
		mv.setViewName("developercontact");
		return mv;
	}//endModelAndView Developer Contact Page
	
	@RequestMapping("/fieldofficelocation")
	public ModelAndView fieldofficelocation(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name") != null){
//			mv.addObject("name", request.getParameter("name"));
//		}//end if statement
		mv.setViewName("fieldofficelocation");
		return mv;
	}//endModelAndView Developer Contact Page
	


}//end class
