package quiz;

public class Homework {

	public static int sum(int a, int b) {
		return a * b;

	}

	public static void main(String[] args) {
		Age age = new Age(33);

		age.setAge(31);
		System.out.println(age.getAge());

		Name name = new Name("rnrn");
		System.out.println(name.getName());
		name.setName("aaaa");
		System.out.println(name.getName());

	}

}

class Age {
	private int age;

	Age(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Name {
	private String name;

	Name(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Person {

	String name;
	String age = 0;
	String nationality = "Korea";

	Person(String name, String age, String nationality) {

		this.name = name;
		this.age = age;
		this.nationality = nationality;

	}

	Person(String name, String age) {

		this.name = name;
		this.age = age;

	}

	Person(String name) {
		this.name = name;
	}

}