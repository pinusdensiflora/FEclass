package pm;

class Car{
	
	
	public void run() {
		System.out.println("차가 달린다");
		
	}
	
	public void run(int v) {
		System.out.println(v + "km/h의 속도로 차가 달린다");
	}
	
	
}


public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.run(50);
	}
}
