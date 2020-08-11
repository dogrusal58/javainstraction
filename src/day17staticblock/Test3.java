package day17staticblock;

public class Test3 {
     static int x = 10 ;//eðer static yapmasaydýk compile time error verir.çünki method static olup variable static olmamasý olmaz.
 
	public
	    static void main(String[] args) {
		   System.out.println(Test3.x);

	}
	static {
		int x = 20;
		System.out.print(x + " ");
	}

}
