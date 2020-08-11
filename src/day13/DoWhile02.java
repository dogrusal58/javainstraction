package day13;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// kulanýcýdan bir sayý alýn sayý çift sayý ise kazandýnýz tek sayý ise kaybettiniz yazdýrýn ve yeni bir sayý isteyin.
		Scanner scan = new Scanner(System.in);
		int s = 12;
		do {System.out.println("Bir sayý girinzi");
		s =scan.nextInt();
		}while(s%2!=0);
		System.out.println("Kazandýnýz");
		scan.close();

	}

}
