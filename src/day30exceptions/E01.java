package day30exceptions;

public class E01 {

	public static void main(String[] args) {
		/*
	1-)kod yazarken kýrmýzý alt çizgi almadýðýnýz halde,kodu çalýþtýrdýktan sonra 
	console da kýrmýzý mesaj alýrsanýz buna 'Run Time Exception' denir.ArithmeticException
	bir Run Time Exception dir.
		 * 
		 */


	 int a = 12;
	 int b = 3 ;
	 System.out.println(a/b);
	 try { 
		 System.out.println(a/b);
	 }

	catch(ArithmeticException e) {
		System.out.println("bir sayýyý sýfýra bölemezsiniz");
	}

	}
}
