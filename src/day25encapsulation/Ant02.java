package day25encapsulation;

public class Ant02 {

	public static void main(String[] args) {
		
		Ant01 obj1 = new Ant01();
		System.out.println(obj1.getIsim());
		
		obj1.setBorc(2500.0f);
		System.out.println(obj1.getBorc());
	}

}
