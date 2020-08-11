package day11;

public class ForLoop01 {

	public static void main(String[] args) {
		//ekrana 10 defa yazdýrma.Bu iþi for-loop döngüsü ile yaparýz.
		//Baslangýç; condition; artýrma/azaltma
		for(int i=1;i<=10;i++) {System.out.println("java");

	}


	for(int i =1;i<=5;i++) {
		System.out.println(i);
	}//1 den 5 e kadar olan sayýlar
	
	for(int i = 2 ; i<15;i+=2) {
		System.out.println(i);
	}// 2den baþlayýp 15 e kadar çift sayýlar
	
	for(int i =4  ;i>=1   ;i--  ) {
		System.out.println(i);
	}// 4 ten 1 e azalarak yazdýk 
	
	for(int i=2;i<=6  ;i+=2  ) {System.out.println(i);
	}//ilk üç çift sayma sayýsý
	
	//2.yol
	for(int i=1;i<=6 ;i++ ) {if(i%2==0) {System.out.println(i);
	
	}//for içinde if kullandým,1 den 6 ya kadar sayma sayýlarýnda 2 ye bölünenleri yazdým.
//ilk yüz çift sayma sayýsýný yazýnýz.
	
	for(int j = 0 ; j<100 ; j++) {
		System.out.println(2*j);
	}
	
	for(int t =0;t<200;t+=2) {System.out.println(t);
	
	}
	
		
		
	
	}
}
}