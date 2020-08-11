package day13;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		//while ile dowhile arasýndaki fark
		//while bazý durumlarda ekraný boþ býrakýr,dowhile asla boþ býrakmaz.
		//do while da önce kodu çalýþtýrýr sonra þartý kontrol eder;while da kontrol önce gelir kod sonra gelir.
		//
		int i =1;
		while(i<1) {System.out.println(i);
		i++;
		}
		do {System.out.println(i);
		i++;
		} 
		while(i<1);
		
		//kullanýcýdan aldýðýmýz sayý 10 dan büyük ide kazandýnýz,10 veya 10 dan küçük ise kaybettiniz.
		//oyun gibi kod yazarken while içindeki þartý döngünün devam etme koþuluna göre ayarlayýn.
		Scanner scan = new Scanner(System.in);
        // s veriable ina 10 dan büyük her deðer vrilebilir.
        int s =20;
        do {
        	if(s<=10) {System.out.println("kaybettiniz");
        	
        	}
        	System.out.println("bir sayý giriniz");
        	s = scan.nextInt();
        }
        while(s<=10);
        System.out.println("kazandýnýz");
        scan.close();
	}

}
