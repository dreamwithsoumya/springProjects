package com.soumya.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView; 

@Controller
public class HelloWorldController {
	@RequestMapping(value="/form", method=RequestMethod.POST)  
    public ModelAndView helloWorld(@ModelAttribute("student") Student student, BindingResult result) { 
		if(result.hasErrors()){
			ModelAndView model1 = new ModelAndView("form");
			return model1;
		}
		ModelAndView model1 = new ModelAndView("hellopage");
		model1.addObject("msg2", "wh!");
		return model1;
    } 
	@ModelAttribute
	public void addingCommonObjects(Model model1){
		model1.addAttribute("msg1","wassup!");
	}
	@RequestMapping("/hi")
	public ModelAndView hiWorld(){
		String message = "hi world!";
		ModelAndView model = new ModelAndView("hellopage");
		model.addObject("message", message);
		return model;
	}

}
