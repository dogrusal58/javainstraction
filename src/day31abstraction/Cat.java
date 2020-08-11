package day31abstraction;

public class Cat extends Mammal {

	@Override
	public void feed() {
		System.out.println("yavrularýný besler");
		
	}
	@Override
	public void move() {
		
		super.move();
	}
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.asi();
		cat.drink();
		cat.eat();
		cat.feed();
		cat.move();

	}
	public void asi() {
		System.out.println("ey kedi iðne ol");
	}
	@Override
	public void drink() {
		System.out.println("su ic");
		
	}
	

}
