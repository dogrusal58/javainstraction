package day2627passbyvalueinheritance;

public class Dog extends Mammal {
	/*java da bir class sadece bir class a extend edilebilir
	 * java da bir class �n sadece bir tane parenti olabilir
	 * java multiple inheritance i onaylamaz
	 * protected(�ocuklar kullanabiliyor) ve public methodlar inheritance a uygundurlar
	 * private methodlar inheritance ye uygun de�ildirler
	 * default ayn� package i�inde iseniz inheritanceye uygundur.fakat farkl� package de iseniz
	 *uygun de�ildir.kullanmak riskldir.bu nedenle inheritance de default kullan�lmaz. 
	 * 
	 * parent class=super class ve child class=sub class
	 * her constructor un ilk sat�r�nda (aksi bir hamle yap�lmad��� s�rece "super()"
	 * constructor call u vard�r.yazsan�zda yazmasan�z da super kodu otomatik �al���r
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