package com.calculator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		int ans;
		ans = Integer.parseInt(request.getParameter("t1"))+
				Integer.parseInt(request.getParameter("t2"));
		mv.addObject("result", ans);
		return mv;
	}
}
