package day08;

import java.util.Scanner;

public class Nestedif01 {

	public static void main(String[] args) {
	
    Scanner scan = new Scanner(System.in);
	System.out.println("cinsiyetinizi giriniz erkek / kadın");
	String cinsiyet =scan.next();
	System.out.println("Yaşınızı giriniz");
	int yas = scan.nextInt();
	if(cinsiyet.equals("Erkek")) {
		
		if(yas<18) {
			System.out.println("Erkek cocuk");
		}else {
			System.out.println("Bay");
		}
	}
		
	else if(cinsiyet.equals("Kadin")) {
		
		if(yas<18) {
			System.out.println("Kiz cocuk");
		}else {
			System.out.println("Bayan");
		}
		
	}else {
		System.out.println("Tanimlanamadi");
	}
	scan.close();
	}
}





