package pm;

public class Forexam {
	public static void main(String[] args) {
		
		
		String[] numbers = {"one", "two", "three"};
		for (int i = 0 ; i < numbers.length ; i++) {
			
			System.out.println(numbers[i]);
			
			
			
			
		}
		
		int[] marks = {90, 25, 67, 45, 80};
		char grade = 'N';
		
		for(int i=0; i<marks.length; i++) {
		
		    if (marks[i] >= 90) {
		        grade = 'A';
		    }else if(marks[i] >= 80){
		    	grade = 'B';
		    }else if(marks[i] >= 70) {
		    	grade = 'C';
		    }else if(marks[i] >= 60) {
		    	grade = 'D';
		    }else {
		    	grade = 'F';
		    }
		    
		    System.out.println((i+1) + "번 학생은 " + grade + "학점입니다.");
		    
		}
		
		
		
		for(int i=0; i<marks.length; i++) {
			
		    if (marks[i] <= 60) {
		    	
		    	continue;
		    }
		    System.out.println((i+1) + "번 학생은 합격입니다.");
		    
		    
		    
		}
	
		
	}

}
