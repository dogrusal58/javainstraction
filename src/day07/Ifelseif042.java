package day07;

import java.util.Scanner;

public class Ifelseif042 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sýnavý giriniz");
		int  s1 = scan.nextInt();
		
		System.out.println("ikinci sýnavý giriniz");
		int s2 = scan.nextInt();
		
		double ort = (s1+s2)/2 ;
		
		if((s1<0 || s2<0) && (s1>100 || s2>100)) {
			System.out.println("notlar negatif ve 100 de büyük olamaz");
		}
		else if(ort<50) {
			System.out.println("kaldýnýz");
		}
		else if(ort<70) {
			System.out.println("C ile geçtiniz");
		}
		else if(ort<85) {
			System.out.println("B ile geçtiniz");
		}
		else if(ort<=100) {
		    System.out.println("A ile geçtiniz");
		}
		scan.close();		
}

}
