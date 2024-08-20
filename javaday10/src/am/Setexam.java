package am;

import java.util.Arrays;
import java.util.HashSet;

public class Setexam {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>(Arrays.asList("H", "e", "l", "l", "o"));
		
		
		System.out.println(set); //[e, H, l, o] 깔끔하게 출력
		// 중복 허용 안 함
		// 순서 없음(unordered);
		
	}
}
