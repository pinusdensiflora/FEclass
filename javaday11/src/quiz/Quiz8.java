package quiz;

import java.util.Scanner;

public class Quiz8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 더합니다.\n몇 개를 더할까요? : ");
		int n = sc.nextInt();
		int sum = 0;
		int count; //index 겸 개수를 받음
		
		
		for (count = 0; count < n; count++) {
			
			System.out.print("정수(0으로 종료) : ");
			int input = sc.nextInt();
			
			if(input == 0) {break;}
			
			sum += input;
			
		}
		
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + ((double)sum/count) + "입니다.");
	}
}
