package day2627passbyvalueinheritance;

public class Animal {
	public int age = 1;
	public Animal() {//constructor
		System.out.println("Animal");
		}
	
	public static void main(String[] args) {
		Animal oa = new Animal();//Obje Animal
		oa.drink();
		oa.eat();
	}
	
	public  void eat() {
		System.out.println("Yemek yerler");
	}
	
	public  void drink() {
		System.out.println("Su icerler");
	}
}