package day30exceptions;

public class E01 {

	public static void main(String[] args) {
		/*
	1-)kod yazarken k�rm�z� alt �izgi almad���n�z halde,kodu �al��t�rd�ktan sonra 
	console da k�rm�z� mesaj al�rsan�z buna 'Run Time Exception' denir.ArithmeticException
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
		System.out.println("bir say�y� s�f�ra b�lemezsiniz");
	}

	}
}
