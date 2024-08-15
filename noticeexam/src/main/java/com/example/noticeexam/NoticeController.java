package com.example.noticeexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoticeController {
	//DB - repository - service - controller - html
	
	@Autowired
	private NoticeService noticeService; //객체 생성

	
	@GetMapping("/")
	public String index(Model model) {//Service로 부터 DB 데이터를 가져옴 Model
		// DB에 있는 데이터를 서비스를 거쳐서 받아옴 (로드)
		model.addAttribute("notices", noticeService.readlist()); //서비스에서 구현해준 메서드
		return "index";
	}
	

	@GetMapping("/create")
	public String create() { 
		
		return "create";
	}
	
	@PostMapping("/create")
	public String create(@ModelAttribute Notice notice) { //저장
		//html로 부터 Notice를 받음
		//서비스로 Notice 객체 보내주기
		noticeService.create(notice); //서비스에서 구현해준 메서드
		return "redirect:/";
	}

}
