package com.example.finalexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute; //
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/create")
	public String create() {
		return "create";
	}
	
	@PostMapping("/create")
	public String create(@ModelAttribute Member member) {
		//DB <- repository <- service <- controller <- html
		// 객체를 생성해서 던져준다 (서비스와 일맥상통)
		// 컨트롤러는 html에서 받은 정보를 `service로 던져줘야하기에`
		// Service 객체를 만들어 던져준다
		
		memberService.create(member);
		
		//return "index"; //index.html 
		return "redirect:/";
		
	}
	
	
	@GetMapping("/")
	public String index(Model model) {
		// 무언가를 가지고 html로 갈때는 (Model model) 을 쓴다 (이런 방법 외에도 2가지 방법이 있는데 걍 이거만 알아두면 됨)
		// Model import 시에 springFramework 인지 확인하고 가져온다.
		model.addAttribute("members", memberService.readlist()); //첫번째 파라미터는 그냥 가져가는 덩어리의 이름
		return "index";
	}
	
}
