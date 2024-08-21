package quiz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	
		Random rand = new Random();
		int rsp = rand.nextInt(3);
		
		
		
		if(rsp == 0) {
			System.out.println("가위");
		}else if(rsp == 1){
			System.out.println("바위");
		}else {
			System.out.println("보");
		}
		
		
		switch(rsp) {
		case 0: System.out.println("s가위"); break;
		case 1: System.out.println("s바위"); break;
		case 2: System.out.println("s보"); break;

		
		}
		
		
		String hand = (rsp==0)? "가위": (rsp==1)? "바위" : "보";
		System.out.println("삼-"+hand);
		
		
	
		
		
	}
}
