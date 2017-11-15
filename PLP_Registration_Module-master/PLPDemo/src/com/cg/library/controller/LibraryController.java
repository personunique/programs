package com.cg.library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.cg.library.model.LibraryUser;
import com.cg.library.service.ILibraryService;



@Controller
public class LibraryController 

{
	@Autowired
      ILibraryService service;
	
	@RequestMapping("/index")
	public String index(Model m)
	{
		m.addAttribute("bean", new LibraryUser());
		return "index";
	}
	@RequestMapping("/start")
	public String start(Model m)
	{
		m.addAttribute("bean",new LibraryUser());
		return "register";
	}
	
	@RequestMapping("/register")
	ModelAndView register( @ModelAttribute("bean") @Valid LibraryUser user, BindingResult result, Model m)
	{
		if(result.hasErrors())
		{
			return new ModelAndView ("register");
		}
		else
		{
			service.register(user);
			return new ModelAndView("success","k",user);
		}
	}
}
;