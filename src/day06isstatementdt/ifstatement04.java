package day06isstatementdt;

import java.util.Scanner;

public class ifstatement04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		int num = scan.nextInt();
		
		if(num>=0 && num<=9) { 
			System.out.println("rakam");
			
		}
		if(num>9 && num<=100)
		{ System.out.println("iki basamaklı sayı");		

	}
    scan.close();

}
}