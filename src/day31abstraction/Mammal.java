package day31abstraction;

public abstract class Mammal extends Animal {
/*
 1-)gördüðünüz gibi mammal animal in child clasý ve asi() methodu ile drink() methodunu
 override etmedi ama herhangi bir compile time error yok.
 çünki abstract child larýn abstract parentteki abstract 
 methodlarý override etme zorunluluðu yoktur.
 */
	public abstract void feed();
	
	public void move() {
		System.out.println("hareket ederler");
	}
}
