package com.niit.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
@Controller
public class UserController {
	@Autowired
   UserDAO userDAO;
   @RequestMapping("/isValidUser")
   public ModelAndView showMessage(@RequestParam(value="name")String name,@RequestParam(value="password")String password)
   {
		System.out.println("in controller");
		String message;
		ModelAndView mv;
		if(userDAO.isValidUser(name,password))
		{
			message="valid credentials";
			mv=new ModelAndView("welcome");
		}
		else
		{
			message="invalid credentials";
			mv=new ModelAndView("login");
		}
		mv.addObject("message",message);
		mv.addObject("name",name);
		return mv;
   }
}
