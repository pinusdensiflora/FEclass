package pm;

import java.util.Scanner;

public class switchexam2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요:");
		int month = sc.nextInt();
		String monthString;

		switch (month) {
		case 1: case 2:
			monthString = "겨울";
			break;
			
		case 3: case 4: case 5:
			monthString = "봄";
			break;
			
		case 6:
		case 7:
		case 8:
			monthString = "여름";
			break;
			
		case 9:
		case 10:
		case 11:
			monthString = "가을";
			break;
			
		case 12:
			monthString = "겨울";
			break;
			
		default:
			monthString = "잘못됨";
			break;

		}

		System.out.println(monthString);

	}
}
