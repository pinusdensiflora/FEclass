package com.example.visitors;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService {

	@Autowired
	private VisitortRepository visitorRepository;
	
	
	public void create(Visitor visitor) {
		
		//레포지토리에 넣기
		//여기에 왔을 때 시간을 입력해서 레포로 보내준다
		visitor.setVdate(LocalDateTime.now()); //시간도 끼워짐 //이런 부분이 서비스의 존재이유
		visitorRepository.save(visitor);
	}
	
	
	
	public List<Visitor> readlist(){
	
		
		return visitorRepository.findAll();
		
	}
	
	
}
