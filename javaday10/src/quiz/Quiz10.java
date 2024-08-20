package quiz;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		System.out.print("변수 A:");
		int a = sc.nextInt();
		System.out.print("변수 B:");
		int b = sc.nextInt();
		System.out.print("변수 C:");
		int c = sc.nextInt();
		
		
		int max= (a > b)? ((a > c)? a : ((b > c)? b : c)) 
				: ((b > c) ? b : c) ; // else if 는 써도 if문 2개나 2중 if문은 못 쓰겄다..
		
		System.out.println(max);
	
	}
}
