package day2627passbyvalueinheritance;

public class Mammal extends Animal{
	public boolean dogum =true;
	public Mammal() {
		System.out.println("mammal");
	}
	
	public static void main(String[] args) {
		Mammal om = new Mammal();//bir obje oluşturdum
		om.drink();
		om.eat();
		om.feed();//noktay bastığımızda 3 tane kullanabileceği metodu görürüz.
		//bu metodlar yeme,içme ve besleme dir
		System.out.println(om.age);
		System.out.println(om.dogum);
		
	}
	
	public  void feed() {
		System.out.println("Yavrularini beslerler");
	}
}