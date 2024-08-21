package quiz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("입력(정수) : ");
		int n = sc.nextInt();
		String fruit = "";
		
		switch (n) {
		case 1:
			fruit = "사과";
			break;
		case 2:
			fruit = "바나나";
			break;
		case 3:
			fruit = "오렌지";
			break;
		case 4:
			fruit = "귤";
			break;
		case 5:
			fruit = "배";
			break;
		case 6:
			fruit = "감";
			break;
		default:
			fruit = "포도";
			break;
		}
		
		System.out.println(fruit);

	}
}
