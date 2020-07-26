package com.example.july25.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*
1. add @Controller annotation
2. create a controller method
- Create ModelAndView(mv)
- mv.setViewName("display"); //can be name of .jsp file.
- mv.addObject("name", object): send this object to the view.
- parameters: e.g. @RequestParam("name") String name
- return ModelAndView

3. add @RequestMapping() annotation to the method 
*/


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
