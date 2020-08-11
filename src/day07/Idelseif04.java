package day07;

import java.util.Scanner;

public class Idelseif04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sýnavý giriniz");
		int  s1 = scan.nextInt();
		System.out.println("ikinci sýnavý giriniz");
		int s2 = scan.nextInt();
		double ort = (s1+s2)/2 ;
if(ort<0) {System.out.println("notlar negatif olamaz");
}else if(ort>=0 && ort<50) {System.out.println("kaldýnýz");
}
		 else if(ort<70) {System.out.println("C ile geçtiniz");
		 
		 }
		 else if(ort<85) {System.out.println("B ile geçtiniz");
		 
		 }
		 else if(ort<=100) {System.out.println("A ile geçtiniz");
		 
		 }
scan.close();
	}
}

