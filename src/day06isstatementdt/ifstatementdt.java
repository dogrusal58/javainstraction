package day06isstatementdt;

import java.util.Scanner;

public class ifstatementdt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tamsay� giriniz");
		int num1 = scan.nextInt();
		if(num1%3==0) {
			System.out.println("3 �n kat�");
		}
        if(num1%3!=0) {
	System.out.println("3 �n kat� de�il");
}

	}

}
