package day08;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("üç kenar uzunluðu giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		String result = a==b && b==c ? "eþkenar üçgen" : "eþkenar üçgen deðil";
			System.out.println(result);
		scan.close();
	}

}
