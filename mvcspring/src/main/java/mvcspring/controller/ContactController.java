package mvcspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvcspring.model.User;

@Controller
public class ContactController {
	
	
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
		
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
	{
		System.out.println(user);
		
		if(user.getUname().isBlank())
		{
			return "redirect:/contact";
		}
	
		return "success";
		
	}
	
	
	/*@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(
			@RequestParam(name="email", required=true) String Useremail,
			@RequestParam("uname") String Username,
			@RequestParam("pass")String Userpass,Model model)
	{
		User user=new User();
		user.setEmail(Useremail);
		user.setUserName(Username);
		user.setPassword(Userpass);
		System.out.println(user);
		
		
		model.addAttribute("user", user);
		
		/*model.addAttribute("email",Useremail);
		model.addAttribute("uname", Username);
		model.addAttribute("pass", Userpass);
		
		
		return "success";*/
}
