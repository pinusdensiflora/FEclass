package com.example.finalexam;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {
	
	
	@Autowired //객체(빈) 생성
	private MemberRepository memberRepository;
	

	public void create(Member member) { // 컨트롤러에서 데이터를 파라미터로 받아서 레포지토리로 던져줘야함 (그럼 레포지토리가 DB로 보냄)
		// 레포지토리로 던지는 방법
		// 객체로 던져야한다
		// 그래서 위에 private MemberRepository memberRepository 를 생성해줬다.
		
		memberRepository.save(member); // .save()는 상속받은 인터페이스에서 이미 구현해 놓았으므로 그냥 사용하면된다.
		
	}
	
	
	public List<Member> readlist(){ // readlist 는 받는 것은 없고 나가는 것만 있다
		// List 임포트 할때 주의해서 잘 골라야한다
		
		return memberRepository.findAll();
		
	}
	
	
}
