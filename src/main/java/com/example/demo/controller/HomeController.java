package com.example.demo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.UserService;


@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	 @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
	    public ModelAndView login(Principal principal) {
	        ModelAndView modelAndView = new ModelAndView();
	        modelAndView.setViewName("login");
	        
	        
	        
//	        String name = principal.getName();
//	        modelAndView.addObject("student", userService.findUserByEmail(name));
	        
	        
	        return modelAndView;
	    }
	 
//	 @RequestMapping(value = {"/admin"}, method = RequestMethod.GET)
//	 //@ResponseBody
//	    public String admin() {
//	       // ModelAndView modelAndView = new ModelAndView();
//	        //modelAndView.setViewName("login");
//	        return "Admin";
//	    }
//	 
	 
	 

}
