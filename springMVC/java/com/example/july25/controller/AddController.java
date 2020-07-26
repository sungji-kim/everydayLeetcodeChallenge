package com.example.july25.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("name") String name) {
		ModelAndView mv = new ModelAndView();
		
		String result = "Hello " + name + "!";
		
		mv.setViewName("display");
		mv.addObject("result", result);
		
		
		
		return mv;
	}

}
