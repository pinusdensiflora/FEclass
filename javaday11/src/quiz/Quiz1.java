package quiz;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz1 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//전역으로 선언
		int again = 1;
		while(again == 1) {
			
			System.out.print("정숫값:");
			int num = sc.nextInt();
			if(num>0) {
				System.out.println("이 값은 양수입니다.");
			}else if(num<0) {
				System.out.println("이 값은 음수입니다.");
			}else {
				System.out.println("이 값은 0입니다.");
			}
			
			System.out.print("다시 한번? 1:Yes / 0:No");
			again= sc.nextInt();
			
			
		} 
		
		//지역변수로 선언
		while(true) {
		
			System.out.print("정숫값:");
			int num = sc.nextInt();
			if(num>0) {
				System.out.println("이 값은 양수입니다.");
			}else if(num<0) {
				System.out.println("이 값은 음수입니다.");
			}else {
				System.out.println("이 값은 0입니다.");
			}
			
			System.out.print("다시 한번? 1:Yes / 0:No");
			int flag= sc.nextInt();
			if(flag == 0) { break; }
			
		} 
		
		
		//do while 문
		int doFlag = 0;
		do {
			
			System.out.print("정숫값:");
			int num = sc.nextInt();
			if(num>0) {
				System.out.println("이 값은 양수입니다.");
			}else if(num<0) {
				System.out.println("이 값은 음수입니다.");
			}else {
				System.out.println("이 값은 0입니다.");
			}
			
			System.out.print("다시 한번? 1:Yes / 0:No");
			doFlag= sc.nextInt();
	
			
		} while(doFlag == 1);
		
	
	}
}
