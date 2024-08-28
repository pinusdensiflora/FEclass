package am;

public class Main {

	public static void main(String[] args) {

		TV tv = new LedTV();
		// 자료형을 인터페이스명으로 선언이 가능하다.
		// 이런 경우에는 인터페이스에서 구현한 기능만을 사용할 수 있다.

	

		tv.turnOn();
		tv.changeVolume(8);
		tv.changeChannel(39);
		tv.turnOff();

		LedTV ledTv= new LedTV();
		ledTv.turnOn();
		ledTv.changeVolume(8);
		
	}
}
