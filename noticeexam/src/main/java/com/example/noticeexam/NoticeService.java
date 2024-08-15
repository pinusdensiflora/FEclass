package com.example.noticeexam;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	//DB - repository - service - controller - html
	
	@Autowired
	private NoticeRepository noticeRepository;
	
	
	public void create(Notice notice) { //저장
		//레포지토리로 Notice 객체 전달 
		noticeRepository.save(notice);
	}
	
	public List<Notice> readlist(){ //로드
		//레포지토리에서 구현된 것을. 그대로 리턴
		return noticeRepository.findAll();
	}
	
}
