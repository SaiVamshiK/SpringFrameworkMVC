package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public ModelAndView getHomePage()
	{
		ModelAndView mv= new ModelAndView();
		mv.setViewName("home");
		mv.addObject("title","Home Page");
		return mv;
	}
}
