package day11;

public class ForLoop01 {

	public static void main(String[] args) {
		//ekrana 10 defa yazd�rma.Bu i�i for-loop d�ng�s� ile yapar�z.
		//Baslang��; condition; art�rma/azaltma
		for(int i=1;i<=10;i++) {System.out.println("java");

	}


	for(int i =1;i<=5;i++) {
		System.out.println(i);
	}//1 den 5 e kadar olan say�lar
	
	for(int i = 2 ; i<15;i+=2) {
		System.out.println(i);
	}// 2den ba�lay�p 15 e kadar �ift say�lar
	
	for(int i =4  ;i>=1   ;i--  ) {
		System.out.println(i);
	}// 4 ten 1 e azalarak yazd�k 
	
	for(int i=2;i<=6  ;i+=2  ) {System.out.println(i);
	}//ilk �� �ift sayma say�s�
	
	//2.yol
	for(int i=1;i<=6 ;i++ ) {if(i%2==0) {System.out.println(i);
	
	}//for i�inde if kulland�m,1 den 6 ya kadar sayma say�lar�nda 2 ye b�l�nenleri yazd�m.
//ilk y�z �ift sayma say�s�n� yaz�n�z.
	
	for(int j = 0 ; j<100 ; j++) {
		System.out.println(2*j);
	}
	
	for(int t =0;t<200;t+=2) {System.out.println(t);
	
	}
	
		
		
	
	}
}
}