package com.example.shopexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	
	@GetMapping("/products")
	public String products() {
		
		return "products";
	}
	
	
	
	@GetMapping("/productdetail")
	public String productdetail() {
		
		return "productdetail";
	}
	
	
	@GetMapping("/create")
	public String create() {
		
		return "create";
	}
	
	@PostMapping("/create")
	public String create(@RequestParam("title") String title, @RequestParam("content") String content) {
		
		System.out.println("제목: "+title);
		System.out.println("내용: "+content);
		
		return "index";
		
		
	}
	


}
