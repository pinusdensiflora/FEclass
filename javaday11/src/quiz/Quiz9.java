package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("숫자 맞추기 게임 시작!\n0부터 99사이의 숫자를 맞추세요.");
		int answer = rand.nextInt(20);
		
		int count = 0;
		boolean flag = false;
		
		for(;;) {
			if(6-count == 0) {
				System.out.println("횟수가 소모되었습니다. 답은 " + answer);
				break;
			}
			
			System.out.print("남은 횟수 "+ (6-count) + "회, 어떤 숫자일까?:");
			int n = sc.nextInt();
			count ++;
		
			if(answer > n) {
				System.out.println("더 큰 숫자입니다.");
			}else if(answer < n) {
				System.out.println("더 작은 숫자입니다.");
			}else {
				flag = true;
				break;
			}
		
		
		}
		
		if(flag) {
			System.out.println(count + "회 만에 맞추었습니다.");
		}
		
		
		
	
	}
}
