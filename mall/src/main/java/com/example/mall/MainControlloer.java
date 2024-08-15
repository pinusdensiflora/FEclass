package com.example.mall;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControlloer {

	//@GetMapping("/main") //주소창에 /main 이라고 들어오면 
	
	@GetMapping("/") // 기본세팅
	public String index() {
		
		return "index";
		
	}
	
	@GetMapping("/main")
	public String main() {
		
		return "main"; // main.html 을 호출한다.
		
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login"; // login.html 을 호출한다.
		
	}
	
	
	@PostMapping("/login")
	public String postlogin(@RequestParam("email") String email,
			@RequestParam("password") String password) { // name(또는 id) = "email"인 값을 email이라는 변수에 담고, password 는 password 에 담는다.
		
		System.out.println(email);
		System.out.println(password);
		return "login";
	}
	
	
	
	@GetMapping("/homepage")
	public String homepage() {
		return "homepage";
		
	}
	
	
	@GetMapping("/favourite")
	public String favourite() {
		return "favourite";
	}
	
	
	@GetMapping("/products")
	public String products() {
		return "products";
		
	}
	
	@GetMapping("/wishlist")
	public String wishlist() {
		return "wishlist";
	}
	
	@GetMapping("/productdetail")
	public String productdetail() {
		
		return "productdetail";
		
	}
	
	
	
	
	@GetMapping("/create")
	public String getcreate() {
		return "create";
	}
	
	@PostMapping("/create")
	public String postcreate(@RequestParam("title1") String title,
						@RequestParam("content") String contents) {
		
		
		System.out.println("입력하신 제목은" + title);
		System.out.println("입력하신 내용은" + contents);
		
		return "index";
		
	}
	
	
	
}












