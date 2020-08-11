package day13;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve 
		 baþlangýç deðerinden baþlayýp bitiþ deðerinde 
        biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
		*/	
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic degerini giriniz");
		int baslangic = scan.nextInt();
		System.out.println("Bitis degerini giriniz");
		int bitis = scan.nextInt();
		
		int product = 1;
		while(baslangic<=bitis) {	
			product = product * baslangic;
			baslangic++;	
		}
		System.out.println(product);
		scan.close();

	}
}



