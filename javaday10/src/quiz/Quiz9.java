package quiz;

import java.util.Scanner;

public class Quiz9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("변수 A:");
		int a = sc.nextInt();
		System.out.print("변수 B:");
		int b = sc.nextInt();

		
		int max = (a > b)? a : b;
		System.out.println("최댓값:" + max);
		
	}

}
