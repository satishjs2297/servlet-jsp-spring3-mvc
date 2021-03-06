package com.accolite.au.web.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EchoController {

	@RequestMapping(value = "/echo", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		model.addAttribute("numbers", Arrays.asList(1,2,3,4,5));
		return "secho";
	}

	@RequestMapping(value = "/echo/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {
		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);
		return model;
	}

}