package day31abstraction;

public abstract class Animal {
	/*
	 1-)"abstract" soyut demektir,zýt anlamlýsý "concrete" dir. "concrete" somut demektir.
	 2-)"abstract" class lardan obje üretilemez.çünki object concrete(somut) tur.ama
	 "abstract" class abstract(soyut)tur.
	 3-)abstract class oluþturarak child class larý bazý þeyleri yapmaya mecbur kýlarýz.
	 abstract class içerisinde oluþturduðunuz abstract methodlar child class lar tarafýndan
	 uygulanmak zorundadýr.concrete class içine abstract method yazamayýz.
	 4-)"abstract" class lar içine abstract olmayan methodlar(concrete) methodlar
	 yazabilirsiniz.Bu methodlar child class lar tarafýndan isteðe baðlý 
	 olarak kullanýlabilirler.
	 
	 */
   public abstract void asi();//abstract methodlarda method body si olmaz.
   public abstract void drink();
   
   public void eat() {
	   System.out.println("yemek yerler");
   }
   
}
