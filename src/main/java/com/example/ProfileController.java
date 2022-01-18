package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	@RequestMapping("")
	public String getProfilePage()
	{
		return "/WEB-INF/views/profile.jsp";
	}
	
	@RequestMapping("/personal")
	public String getPersonalPage()
	{
		return "/WEB-INF/views/personalProfile.jsp";
	}	
}
