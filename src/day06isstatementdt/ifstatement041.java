package day06isstatementdt;

import java.util.Scanner;

public class ifstatement041 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("birnci say�y� giriniz");
		float num1 = scan.nextFloat();
		System.out.println("ikinci say�y� giriniz");
		float num2 = scan.nextFloat();
		if(num1/num2==0) {System.out.println("birinci say� s�f�r");
		
		}
		if(num1/num2==1) {System.out.println("iki say� birbirine e�it");
		
		}
		if(num1/num2>1) {System.out.println("birinci say� b�y�k");
		
		}
		if(num1/num2<1) {System.out.println("kesir");
		
		}
		scan.close();
	}
	
}
