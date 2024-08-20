package am;

import java.util.ArrayList;
import java.util.Arrays;

public class Finalexam {
	public static void main(String[] args) {
		

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        //a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생
        //재할당이 불가능!!!!
        
        System.out.println(a);
		
		
	}
}
