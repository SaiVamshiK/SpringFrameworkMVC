package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	@ResponseBody
	@RequestMapping("")
	public String getProfilePage()
	{
		return "This is profile page";
	}
	
	@ResponseBody
	@RequestMapping("/personal")
	public String getPersonalPage()
	{
		return "This is personal profile page";
	}	
}
