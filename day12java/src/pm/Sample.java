package pm;

class Animal{
	
	String name;
	
	void setName(String name) {
		
		this.name = name;
		
	}
	
	void bark() {
		
		System.out.println("yayaya");
	}
	
}


class Dog extends Animal{
	
	//부모 클래스 Animal이 모든 것이 보이지는 않지만 이미 와 있다.
	
	void sleep() {
		
		System.out.println("zzzz...");
	}
	
	void bark() {
		
		System.out.println("barkbark");
	}
	
	
}

class HouseDog extends Dog{
	
	@Override //이런 주석 원래 안써도 되는데 웹 개발 할 때는 안쓰면 에러뜸 ㅠ ㅠ 
	void sleep() {
		System.out.println(this.name + "zzzz in House");
		
	}
	
}


public class Sample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.setName("poppy");
		System.out.println(dog.name);
		
		
		
		Animal dog2 = new Dog();
		//상속받고 있는 부모의 자료형으로도 생성이 가능하다. (하위의 것(세부적인 것)을 큰 것에 넣는 것이 가능)
		
		//dog2.sleep(); //불가능 Animal이기 떄문이다.
		dog2.bark(); // barkbark
		
		
	
		
		
		
	}

}
