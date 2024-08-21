/* 정수 맞추기 
 * 
 * 
 * 
 * 
 * */
package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		
		int num = rand.nextInt(90) + 10;
		int myint;
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요");
		
		
		
		while(true) {
			
			System.out.print("어떤 숫자일까?:");
			myint = sc.nextInt();
			
			if(num > myint) {
				System.out.println("더 큰 숫자입니다.");
			}else if(num < myint) {
				System.out.println("더 작은 숫자입니다.");
			}else {
				System.out.println("정답입니다!");
				break;
			}

		}
		
		
		
		
		
	}

}
