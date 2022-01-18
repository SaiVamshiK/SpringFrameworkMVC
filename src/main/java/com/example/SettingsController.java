package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SettingsController {
	@ResponseBody
	@RequestMapping("/settings")
	public String getSettingsPage()
	{
		return "This is settings page";
	}
}
