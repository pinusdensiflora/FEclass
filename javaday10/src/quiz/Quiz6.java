package quiz;

import java.util.Scanner;

public class Quiz6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 a:");
		int a = sc.nextInt();
		System.out.print("정수 b:");
		int b = sc.nextInt();
		
		int result;
		
		if(a > b) {
			result = a - b;
		
		}else {
			result = b - a;
			
		}
		
		System.out.println("두 값의 차는 "+ result + "입니다.");
		
	}
}
