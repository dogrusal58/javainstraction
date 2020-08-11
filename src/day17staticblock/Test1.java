package day17staticblock;

public class Test1 {
	static   int x = 10 ;
	public 
	    static void main(String[] args) {
	    System.out.println(x);
	}
	static {
		System.out.print(x + " ");//static in içinde kullanýlacak variable static olmalý
		//eðer yukarýdakistatic int  x = 10 yerine sadece int x = 10 deseydik kýrmýzý uyarý verirdi.(compile time error)
	}


	}


