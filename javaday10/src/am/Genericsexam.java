package am;

import java.util.ArrayList;

public class Genericsexam {
	
	public static void main(String[] args) {
		
		/*제너릭스 없이 사용했을 경우*/
		ArrayList pitches = new ArrayList(); //생성
		
		pitches.add("123"); //배열 데이터 넣기
		pitches.add("456");
	
		
		String one = (String) pitches.get(0);//배열 데이터 꺼내기
		String two = (String) pitches.get(1);

		//제너릭스를 사용하지 않으면 Array에 들어가는 요소가 기본 자료형 Object로 들어가게되어
		//데이터를 꺼낼 때마다 (String)으로 형변환을 해 주어야한다.
		//배열에 다른 형식의 데이터를 넣어도 오류가 나지 않으나, 사용시에 주의가 필요하고 오류가 잦다.
		
		
		/*제너릭스 사용*/
		ArrayList<String> pitches2 = new ArrayList<String>();
		
		pitches2.add("123"); //배열 데이터 넣기
		pitches2.add("456");
		
		String one2 = pitches2.get(0);//배열 데이터 꺼내기
		String two2 = pitches2.get(1);
		
		// 배열의 값이 String 임이 보장되기에 별도의 캐스팅이 필요하지 않다.
		
		
		
		
		
		
		
	}
	
}
