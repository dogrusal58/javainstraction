package Day09;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("gün numarasý yazýnýz");
		int day = scan.nextInt();
		
		switch (day) {
		case 1 :
			System.out.println("pazar");
			break;
		case 2 :
			System.out.println("pazartesi");
			break;
		case 3 :
			System.out.println("salý");
			break;
		case 4 :
			System.out.println("çarþamba");
			break;
		case 5 :
			System.out.println("perþemba");
			break;
		case 6 :
			System.out.println("cuma");
			break;
		case 7 :
			System.out.println("cumartesi");
			break;
			default :
				System.out.println("geçerli gün numarasý giriniz");
			
		}
		scan.close();

	}

}
