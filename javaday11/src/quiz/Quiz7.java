package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정방형을 표시합니다.\n단수는 : ");
		int n = sc.nextInt();
	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j>i) {
					System.out.print(" ");
					
				}else {
					System.out.print("*");
					
				}
				
			}
			System.out.println();
		}
	
		
		System.out.println();
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j>=i) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
	
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j >= n-i-1) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
		}
	
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j > n-i-1) {
					System.out.print(" ");
					
				}else {
					System.out.print("*");
					
				}
				
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j > n/2 - (i+1) && j < n/2 + (i+1)) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
					
				}
				
			}
			System.out.println();
			if(n/2 == i) {break;}
		}
		
		
		
	}
}
