package day06isstatementdt;

import java.util.Scanner;

public class ifstatement02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir g�n giriniz");
		String gun = scan.next();
		if(gun.equals("cuma"))
		{
			System.out.println("m�sl�manlar i�in kutsal g�n");
		}
if(gun.equals("cumartesi")) {
	System.out.println("hristyanlar i�in kutsal g�n");
	
}
if(gun.equals("pazar")){
	System.out.println("museviler i�in kutsal g�n");
}
scan.close();
	}

}
