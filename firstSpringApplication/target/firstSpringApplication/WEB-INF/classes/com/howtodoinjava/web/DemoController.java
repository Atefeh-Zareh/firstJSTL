package com.howtodoinjava.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/access")
public class DemoController 
{
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) 
	{
		model.addAttribute("message", "Spring 3 MVC Hello World !! Thanks to www.howtodoinjava.com");
		return "helloWorld";
	}
}
