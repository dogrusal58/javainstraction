package day2627passbyvalueinheritance;

public class Bird extends Animal{
	public boolean kanat = true;
	public Bird() {
		System.out.println("bird");
	}
	public static void main(String[] args) {
		Bird ob = new Bird();
		ob.fly();
		ob.eat();
		ob.drink();
		System.out.println(ob.age);
		System.out.println(ob.kanat);
	}
	
	public  void fly() {
		System.out.println("Ucarlar");
	}
}