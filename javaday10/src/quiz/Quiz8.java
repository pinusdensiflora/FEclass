package quiz;

import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("나이:");
		int age = sc.nextInt();
	
		String result = (age >= 18)? "성인입니다." : "미성년자입니다.";
		System.out.println(result);
		
//		if (age >= 18) {
//			System.out.println("성인입니다.");
//		}else {
//			System.out.println("미성년자입니다.");
//		}
//		
		
	
	}
}
