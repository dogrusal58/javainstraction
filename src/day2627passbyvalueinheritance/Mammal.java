package day2627passbyvalueinheritance;

public class Mammal extends Animal{
	public boolean dogum =true;
	public Mammal() {
		System.out.println("mammal");
	}
	
	public static void main(String[] args) {
		Mammal om = new Mammal();//bir obje olu�turdum
		om.drink();
		om.eat();
		om.feed();//noktay bast���m�zda 3 tane kullanabilece�i metodu g�r�r�z.
		//bu metodlar yeme,i�me ve besleme dir
		System.out.println(om.age);
		System.out.println(om.dogum);
		
	}
	
	public  void feed() {
		System.out.println("Yavrularini beslerler");
	}
}