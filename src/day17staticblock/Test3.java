package day17staticblock;

public class Test3 {
     static int x = 10 ;//e�er static yapmasayd�k compile time error verir.��nki method static olup variable static olmamas� olmaz.
 
	public
	    static void main(String[] args) {
		   System.out.println(Test3.x);

	}
	static {
		int x = 20;
		System.out.print(x + " ");
	}

}
