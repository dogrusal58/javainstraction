package day08;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir karakter girin");
		char ch = scan.next().charAt(0);
		String result = (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ? "Harf" : "Harf deðil";
		System.out.println(result);
		scan.close();
			

	}

}
