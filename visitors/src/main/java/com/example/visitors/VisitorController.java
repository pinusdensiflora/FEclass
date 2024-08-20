package com.example.visitors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VisitorController {

	
	@Autowired
	private VisitorService visitorService;
	
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("visitors", visitorService.readlist());
		
		return "index";
	}
	
	@PostMapping("/")
	public String index(@ModelAttribute Visitor visitor) {
		
		//서비스로 보내주기
		
		
		visitorService.create(visitor);
		return "redirect:/"; //경로명
	}
	
}
