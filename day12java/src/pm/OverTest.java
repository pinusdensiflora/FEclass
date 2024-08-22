package pm;


class NewAnimal{
	
	boolean hungry = true;
	
	void eat(){
		this.hungry = false;
		System.out.println("동물이 밥을 먹음");
	}

}

class NewDog extends NewAnimal {

	void eat(){
		this.hungry = false;
		System.out.println("개가 밥을 먹음");
	}
	void eat(String food){
		this.hungry = false;
		System.out.println("개가 " + food + "를 먹음");
	
	}
	
}

public class OverTest {
	
	public static void main(String[] args) {
	
		
		
		
		NewDog a = new NewDog();
		a.eat();
		System.out.println(a.hungry);
	
	
		NewDog b = new NewDog();
		b.eat("flower");
		System.out.println(b.hungry);
	
		
		NewAnimal c = new NewDog();
		c.eat(); //오버라이딩 됨
		//c.eat("food"); //불가능 Animal 이기때문

		
	}
	


}
