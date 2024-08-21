package quiz;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변수 A:");
		int a = sc.nextInt();
		System.out.print("변수 B:");
		int b = sc.nextInt();
		
		
		if(a < b) {
			int temp = b;
			
			b = a;
			a = temp;
		}
		
		System.out.println("a>=b 가 되도록 정렬했습니다.");
		System.out.println("변수 a:" + a);
		System.out.println("변수 b:" + b);
		
//		
		
		
		
	}
}
