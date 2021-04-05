package it.fp.helloheroku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloHeroku {
	
	@RequestMapping(value ="/hello", method = RequestMethod.GET)
	public String hello(Model model){
		
		return "hello";
	}

}
