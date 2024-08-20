package am;

import java.util.HashMap;

public class Hashmapexam {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("people", "사람");
		map.put("apple", "사과");
		
		
		System.out.println(map.get("apple")); // 사과 출력
		System.out.println(map.get("banana")); // null 출력
		
		System.out.println(map.getOrDefault("java", "데이터가 없으면 출력")); //디폴트 value 지정
		
	}
	
}
