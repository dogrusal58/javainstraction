package day08;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� kenar uzunlu�u giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		String result = a==b && b==c ? "e�kenar ��gen" : "e�kenar ��gen de�il";
			System.out.println(result);
		scan.close();
	}

}
