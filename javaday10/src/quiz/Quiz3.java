package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정숫값:");
		int n = sc.nextInt();
		
		
		if(n > 0) {
			System.out.println("값이 양수입니다.");
		}else if(n < 0) {
			System.out.println("값이 음수입니다.");
		}else {
			System.out.println("값이 0입니다.");
		}
		
		
		
	}

}
