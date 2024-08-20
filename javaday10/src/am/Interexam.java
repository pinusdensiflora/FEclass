package am;

import java.util.Arrays;
import java.util.HashSet;

public class Interexam {
	
	public static void main(String[] args) {
		
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

		//교집합을 담을 집합생성
		HashSet<Integer> intersection = new HashSet<>(s1);
		
		//교집합 수행
		intersection.retainAll(s2);
		
		System.out.println(intersection); // [4, 5, 6]

		
		
	
	}
	

}
