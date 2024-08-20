package quiz;

import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변수 A:");
		int a = sc.nextInt();
		System.out.print("변수 B:");
		int b = sc.nextInt();
		System.out.print("변수 C:");
		int c = sc.nextInt();

		int min = a;
		
		if(a > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		
		
		
		
		System.out.println("최솟값은 " + min + "입니다.");

		
	}
}
