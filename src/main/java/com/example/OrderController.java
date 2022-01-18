package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
	@RequestMapping("/order")
	public ModelAndView getOrder(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("Order Item is : "+request.getParameter("orderItem"));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("order");
		mv.addObject("orderValue",request.getParameter("orderItem"));
		return mv;
	}
}
