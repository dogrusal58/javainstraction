package day31abstraction;

public abstract class Mammal extends Animal {
/*
 1-)g�rd���n�z gibi mammal animal in child clas� ve asi() methodu ile drink() methodunu
 override etmedi ama herhangi bir compile time error yok.
 ��nki abstract child lar�n abstract parentteki abstract 
 methodlar� override etme zorunlulu�u yoktur.
 */
	public abstract void feed();
	
	public void move() {
		System.out.println("hareket ederler");
	}
}
