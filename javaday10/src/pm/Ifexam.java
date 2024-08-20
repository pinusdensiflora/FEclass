package pm;

import java.util.ArrayList;

public class Ifexam {
	
	public static void main(String[] args) {
		
//		int money = 2000;
//		boolean hasCard = false;
//		
//		
//		if(money>=3000 || hasCard) {
//			System.out.println("택시");
//			
//		}else {
//			System.out.println("걷기");
//		}
//		

		
		
		ArrayList<String> pocket = new ArrayList<>();
		
		
		pocket.add("paper");
		pocket.add("mobile");
		//pocket.add("money");
		
		boolean hasCard = true;
	
		
		if(pocket.contains("money")) {
			System.out.println("택시");
			
		}else if(hasCard){
			System.out.println("택시타");
			
		}else {
			System.out.println("걷기");
			
		}
		
		
		
		
		
		
	}
}
