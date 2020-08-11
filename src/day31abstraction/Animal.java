package day31abstraction;

public abstract class Animal {
	/*
	 1-)"abstract" soyut demektir,z�t anlaml�s� "concrete" dir. "concrete" somut demektir.
	 2-)"abstract" class lardan obje �retilemez.��nki object concrete(somut) tur.ama
	 "abstract" class abstract(soyut)tur.
	 3-)abstract class olu�turarak child class lar� baz� �eyleri yapmaya mecbur k�lar�z.
	 abstract class i�erisinde olu�turdu�unuz abstract methodlar child class lar taraf�ndan
	 uygulanmak zorundad�r.concrete class i�ine abstract method yazamay�z.
	 4-)"abstract" class lar i�ine abstract olmayan methodlar(concrete) methodlar
	 yazabilirsiniz.Bu methodlar child class lar taraf�ndan iste�e ba�l� 
	 olarak kullan�labilirler.
	 
	 */
   public abstract void asi();//abstract methodlarda method body si olmaz.
   public abstract void drink();
   
   public void eat() {
	   System.out.println("yemek yerler");
   }
   
}
