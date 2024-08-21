package quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 A:");
		int a = sc.nextInt();
		System.out.print("정수 B:");
		int b = sc.nextInt();
		
		int index = a;
		
		if(a > b) {
			index = b;
			b = a;
			a = index;
		}
		
		while(index <= b) {
			System.out.print(index + " ");
			index ++;
		}
		
		/*-----------------------------------------*/
		System.out.println();
		
		
		if(a > b) {
			int temp = b;
			b = a;
			a = temp;
		}
		
		while(a <= b) {
			System.out.print(a + " ");
			a ++;
		}
		
		
	}
}
