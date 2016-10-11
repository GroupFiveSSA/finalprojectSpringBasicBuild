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
	}//endModelAndView banrhome
	
	@RequestMapping("/hudlink")
	public ModelAndView hudlink(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name") != null){
//			mv.addObject("name", request.getParameter("name"));
//		}//end if statement
		mv.setViewName("hudlink");
		return mv;
	}//endModelAndView hudlink
	
	
	
	


}//end class
