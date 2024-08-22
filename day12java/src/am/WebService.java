package am;


//@Service
public class WebService {

	//@Autowired
	//private WebRepository webRepository;
	
	WebRepository webRepository = new WebRepository();
	

	
	void create(String data){
		
		System.out.println("서비스에 넘어온 데이터 확인 : " + data);
		webRepository.create(data);
		
		
	}

	
	
	
	
	
}
