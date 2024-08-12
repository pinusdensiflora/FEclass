package com.example.mall;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainControlloer {

	@GetMapping("/main") //주소창에 /main 이라고 들어오면 
	
	public String main() {
		
		return "main"; // main.html 을 호출한다.
		
	}
	
}
