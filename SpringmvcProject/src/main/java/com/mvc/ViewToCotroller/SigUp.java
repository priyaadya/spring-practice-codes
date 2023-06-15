package com.mvc.ViewToCotroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SigUp {
	
	//process Controller
	
	@RequestMapping("/contact")
	public String Contact() {
		return "SignUp";
		
	}
	
	//handler controler which will specify the final destiation of SignUp page
	@RequestMapping(path="/process",method=RequestMethod.POST)
	public String HandleFormData(
			@RequestParam ("uname") String user_name,
			@RequestParam ("email") String user_email,
			@RequestParam ("userPass") String user_pass,
			
			Model model) {
		
		
		System.out.println("Your Name is:"+user_name);
	
		System.out.println("Your Email is:"+user_email);
		System.out.println("Your Pass is:"+user_pass);
		model.addAttribute("un",user_name);
		model.addAttribute("um",user_email);
		model.addAttribute("up",user_pass);
		
		

		return "Success";
		
	}
	

}
