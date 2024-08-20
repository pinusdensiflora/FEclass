package quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("변수 a:");
		int a = sc.nextInt();

		System.out.print("변수 b:");
		int b = sc.nextInt();
		
		
		if(a > b){
			System.out.println("a가 크다.");
			
		}else if(a < b) {
			System.out.println("b가 크다.");
			
		}else {
			System.out.println("a와 b가 같다.");
			
		}
		
		
		
	}
}
