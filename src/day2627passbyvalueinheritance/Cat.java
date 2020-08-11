package day2627passbyvalueinheritance;

public class Cat extends Mammal {
	public boolean biyik = true;
	public Cat() {
		System.out.println("cat");
	}
	public static void main(String[] args) {
		Cat oc = new Cat();//obje cat
		oc.meow();//obje nin nerelerden clone aldýðýný gösteriyor
		oc.feed();
		oc.eat();
		oc.drink();
		oc.clean();
		System.out.println(oc.age);
		System.out.println(oc.biyik);
		System.out.println(oc.dogum);
	}
	
	public  void meow() {
		System.out.println("Miyavlarlar"); 
	}
	
	public  void clean() {
		System.out.println("Temizlenirler");
	}
}