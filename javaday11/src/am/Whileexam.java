package am;

public class Whileexam {

	public static void main(String[] args) {
		
		
		
		int treeHit = 0;
		
		while(treeHit < 10) {

			treeHit++;
			System.out.println("나무를" + treeHit + "번 찍었습니다.");
			
			if(treeHit == 10) {
				System.out.println("나무 넘어갑니다.");
			}
			
		}
		//while 문은 주로 방법의 횟수가 명확하지 않을 경우에 사용된다.
		//for 문은 주로 방법의 횟수가 명확할 때 사용된다. 
		//while 과 for 는 서로 호환이 가능하기 때문에 상관은 없으나 상황에 따라 선택
		
		
		
		int money = 300;
		int coffee = 10;
		
		while(money > 0) {//true
			System.out.println("커피판매 시행.");
			
			coffee --;
			System.out.println("잔여 커피 : " + coffee);
			if(coffee == 0) { //종료조건
				System.out.println("커피가 없음. 판매중단");
				break;
			}
			
			
		}
		
		
		
		
		int a=0;
		while(a<10) {//true
			a++;
			if(a%2 == 0) { //짝수면 continue
				continue;
			}
			
			System.out.println(a); //홀수만 출력
			
		}
		
		
		
		
	}
}
