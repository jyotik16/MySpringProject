package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController3 {
@RequestMapping("/home")
	public ModelAndView display() {
	
		ModelAndView mv = new ModelAndView("viewpage3");
		mv.addObject("Name","Jyoti");
		mv.setViewName("viewpage3.jsp");
		return mv;
		}
}
