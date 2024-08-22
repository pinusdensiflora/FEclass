package am;


//@Controller
public class WebController {
	
	//@Autowired
	//private WebService webService;
	
	WebService webService = new WebService();
	
	void create(){
	
		String data = "안녕하세요? data 입니다.";
		System.out.println("컨트롤러 데이터 확인 : " + data);
		
		webService.create(data);
		
	}
	
	
	public static void main(String[] args) {
		
		WebController webController = new WebController(); // 조금 어색하긴한데 일단 진행
		
		webController.create();
		
	}
	
	
} 
