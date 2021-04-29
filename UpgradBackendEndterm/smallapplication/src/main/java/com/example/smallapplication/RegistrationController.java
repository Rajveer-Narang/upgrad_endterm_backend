package com.example.smallapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
@RequestMapping("/regform")
public String register() {
	return "registration";
}
@RequestMapping("/userDetail")
public ModelAndView userInfo(UserRegistration reg) {
	ModelMap model = new ModelMap();
	model.addAttribute("name", reg.getnm());
	model.addAttribute("age", reg.getage());
	model.addAttribute("email", reg.getemail());
	model.addAttribute("address", reg.getaddress());
	model.addAttribute("phone", reg.getph());
	
	ModelAndView mv =new ModelAndView("user-details");
	mv.addObject("regObj", reg);
	return mv;
	
}

@RequestMapping("/regform2")
public String again() {
	return "registration";
	
}



}
