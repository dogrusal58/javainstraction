package day13;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		//while ile dowhile aras�ndaki fark
		//while baz� durumlarda ekran� bo� b�rak�r,dowhile asla bo� b�rakmaz.
		//do while da �nce kodu �al��t�r�r sonra �art� kontrol eder;while da kontrol �nce gelir kod sonra gelir.
		//
		int i =1;
		while(i<1) {System.out.println(i);
		i++;
		}
		do {System.out.println(i);
		i++;
		} 
		while(i<1);
		
		//kullan�c�dan ald���m�z say� 10 dan b�y�k ide kazand�n�z,10 veya 10 dan k���k ise kaybettiniz.
		//oyun gibi kod yazarken while i�indeki �art� d�ng�n�n devam etme ko�uluna g�re ayarlay�n.
		Scanner scan = new Scanner(System.in);
        // s veriable ina 10 dan b�y�k her de�er vrilebilir.
        int s =20;
        do {
        	if(s<=10) {System.out.println("kaybettiniz");
        	
        	}
        	System.out.println("bir say� giriniz");
        	s = scan.nextInt();
        }
        while(s<=10);
        System.out.println("kazand�n�z");
        scan.close();
	}

}
