package day2627passbyvalueinheritance;

public class Car extends Vehicle {
	public Car() {
		super(2);//parametreli constructor ý bul nerede parentte(parentteki construractorlarý çaðýrýr)
		System.out.println("car");
	}
	public Car(String name) {
		this();//bu classtaki cobstructora git
		System.out.println("car");
	}

	public static void main(String[] args) {
		Car car = new Car("HONDA");

	}

}
