package com.lovecode.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add an initbinder ... to convert trim input strings
	//remove leading and trailing whitespace
	//resolve issue for our validation 
	@InitBinder
	public void iniciaBinder(WebDataBinder cenas) {
		
		StringTrimmerEditor ovos = new StringTrimmerEditor(true);
		
		cenas.registerCustomEditor(String.class, ovos);
	}

	
	@RequestMapping("/showForm")
	public String showForm(Model bananas) {
		
		bananas.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer couves, 
			BindingResult uvas ){
		System.out.println("FirstName: |" + couves.getFirstName() + "|");
		
		System.out.println("Binding result: " + uvas);
		
		System.out.println("\n\n\n\n");
		
		if(uvas.hasErrors()) {
			
			return "customer-form";
				
			}else {

				return "customer-confirmation";

		}
				
	}
}
