package day17staticblock;

public class Test1 {
	static   int x = 10 ;
	public 
	    static void main(String[] args) {
	    System.out.println(x);
	}
	static {
		System.out.print(x + " ");//static in i�inde kullan�lacak variable static olmal�
		//e�er yukar�daki static int  x = 10 yerine sadece int x = 10 deseydik k�rm�z� uyar� verirdi.(compile time error)
	}


	}


