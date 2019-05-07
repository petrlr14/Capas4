package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView init() {
		ModelAndView view=new ModelAndView();
		view.addObject("product", new Product());
		view.setViewName("main");
		return view; 
	}
	
	@RequestMapping(path = "/validate", method = RequestMethod.POST )
	public ModelAndView process(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		ModelAndView view=new ModelAndView();
		if(result.hasErrors()) {
			view.setViewName("main");
		}else {
			view.setViewName("valid");
		}
		return view;
	}
	
}
