package helloworld;

import java.util.Scanner;

public class Helloworld {
	
	public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println();
        
        
        
        
        
        
        //1
		String first = "첫 Java 프로그램입니다.";
		String second = "화면에 출력하고 있습니다.";
		
		System.out.print(first + " ");
		System.out.println(second);
		
		
		System.out.println(first + " " + second);
		
		System.out.println("첫 Java 프로그램입니다. 화면에 출력하고 있습니다.");
		
		
		
		//2
		
		int x, y, z; //int형 x, y, z 변수 선언
		x = 63;
		y = 18;
		z = 52;
		
		System.out.println("x값은 " + x + "입니다.");
		System.out.println("y값은 " + y + "입니다.");
		System.out.println("z값은 " + z + "입니다.");
		System.out.println("합계는 " + (x+y+z) + "입니다.");
		System.out.println("평균은 " + ((x+y+z)/3) + "입니다.");
		

		//3
		
		double[] a = new double[5];
		
		for(int i = 0 ; i< a.length ; i++) {
			
			System.out.println("a[" + i + "] = " + a[i]);
		
		}
        
        
		
		//4,5
		Scanner sc = new Scanner(System.in);

		System.out.print("정숫값 : ");
		
		//String i = sc.next(); //String으로 받음
		int i = sc.nextInt(); //정수로 받음
		
		System.out.println("10을 더한 값은 " + (i+10) + "입니다.");
		System.out.println("10을 뺀 값은 " + (i-10) + "입니다.");
		

        
		//6
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.print("x값:");
		double dx = sc.nextDouble();
		System.out.print("y값:");
		double dy = sc.nextDouble();

		
		System.out.println("합계는 " + (dx+dy) + "입니다.");
		System.out.println("평균은 " + ((dx+dy)/2) + "입니다.");
		
		
		
	}

	
}
