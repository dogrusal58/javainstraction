package day13;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// kulan�c�dan bir say� al�n say� �ift say� ise kazand�n�z tek say� ise kaybettiniz yazd�r�n ve yeni bir say� isteyin.
		Scanner scan = new Scanner(System.in);
		int s = 12;
		do {System.out.println("Bir say� girinzi");
		s =scan.nextInt();
		}while(s%2!=0);
		System.out.println("Kazand�n�z");
		scan.close();

	}

}
