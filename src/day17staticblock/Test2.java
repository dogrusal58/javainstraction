package day17staticblock;

public class Test2 {
int x = 10 ;

	public
	    static void main(String[] args) {
		Test2 t1 = new Test2();
		System.out.println(t1.x);
		

	}
	static {
		int x = 20;
		System.out.print(x + " ");
	}

}
