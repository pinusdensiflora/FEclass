package am;

public class Castingexam {
	public static void main(String[] args) {
	
//		//문자에서 숫자로
//		String num = "123";
//		int n = Integer.parseInt(num);
//		System.out.println(n);
//		
//		
//		//숫자를 문자로
//		int n2 = 555;
//		String num2 = "" + n2;
//		System.out.println(num2);
		
		
		
//		int n = 123;
//		
//		String num1 = String.valueOf(n);
//		String num2 = Integer.toString(n);
//		
//		System.out.println(num1);
//		System.out.println(num2);
		
		
		
        int n1 = 123;
        double d1 = n1;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d1);  // 123.0 출력

        double d2 = 123.456;
        int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println(n2);  // 소숫점이 생략된 123 출력
		
		
		
		
	}
}
