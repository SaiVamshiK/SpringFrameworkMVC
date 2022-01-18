package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SettingsController {
	@RequestMapping("/settings")
	public String getSettingsPage()
	{
		return "/WEB-INF/views/settings.jsp";
	}
}
