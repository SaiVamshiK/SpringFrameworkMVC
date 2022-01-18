package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	@RequestMapping("")
	public String getProfilePage()
	{
		return "profile";
	}
	
	@RequestMapping("/personal")
	public String getPersonalPage()
	{
		return "personalProfile";
	}	
}
