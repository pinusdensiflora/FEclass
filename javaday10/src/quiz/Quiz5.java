package quiz;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		
		if(score>100 || score < 0) {
			System.out.println("잘못된 점수입니다.");
			
		}else if(90 <= score) {
			System.out.println("수");
			
		}else if(80 <= score) {
			System.out.println("우");
			
		}else if(70 <= score) {
			System.out.println("미");
			
		}else if(60 <= score) {
			System.out.println("양");
			
		}else {//0~59
			System.out.println("가");
		}
		
		
		
	}
}
