package day2627passbyvalueinheritance;

public class Mammal extends Animal{
	public boolean dogum =true;
	public Mammal() {
		System.out.println("mammal");
	}
	
	public static void main(String[] args) {
		Mammal om = new Mammal();//bir obje oluþturdum
		om.drink();
		om.eat();
		om.feed();//noktay bastýðýmýzda 3 tane kullanabileceði metodu görürüz.
		//bu metodlar yeme,içme ve besleme dir
		System.out.println(om.age);
		System.out.println(om.dogum);
		
	}
	
	public  void feed() {
		System.out.println("Yavrularini beslerler");
	}
}