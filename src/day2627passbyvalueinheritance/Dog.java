package day2627passbyvalueinheritance;

public class Dog extends Mammal {
	/*java da bir class sadece bir class a extend edilebilir
	 * java da bir class ýn sadece bir tane parenti olabilir
	 * java multiple inheritance i onaylamaz
	 * protected(çocuklar kullanabiliyor) ve public methodlar inheritance a uygundurlar
	 * private methodlar inheritance ye uygun deðildirler
	 * default ayný package içinde iseniz inheritanceye uygundur.fakat farklý package de iseniz
	 *uygun deðildir.kullanmak riskldir.bu nedenle inheritance de default kullanýlmaz. 
	 * 
	 * parent class=super class ve child class=sub class
	 * her constructor un ilk satýrýnda (aksi bir hamle yapýlmadýðý sürece "super()"
	 * constructor call u vardýr.yazsanýzda yazmasanýz da super kodu otomatik çalýþýr
	 */
	public Dog() {
		super();
		System.out.println("dog");
	}
	public boolean loyal = true;
	public static void main(String[] args) {
		Dog od =new Dog();//obje dog
		od.smell();//bunlar method
		od.feed();
		od.drink();
		od.bark();
		System.out.println("yas? :" + od.age);//bunlar variable
		System.out.println("dogum? :" + od.dogum);
		System.out.println("sadik? : "+ od.loyal);
	
	}
	
	public  void bark() {
		System.out.println("Havlarlar");
	}
	
	public  void smell() {
		System.out.println("Iyi koku alirlar");
	}
}