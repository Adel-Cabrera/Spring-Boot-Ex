package com.darkonnen.ninjagoldgame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/gold";	
	}
	
	@RequestMapping("/gold")
	public String gold() {
		return "index.jsp";
	}



}
