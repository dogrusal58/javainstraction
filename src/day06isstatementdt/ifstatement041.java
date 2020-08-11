package day06isstatementdt;

import java.util.Scanner;

public class ifstatement041 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("birnci sayýyý giriniz");
		float num1 = scan.nextFloat();
		System.out.println("ikinci sayýyý giriniz");
		float num2 = scan.nextFloat();
		if(num1/num2==0) {System.out.println("birinci sayý sýfýr");
		
		}
		if(num1/num2==1) {System.out.println("iki sayý birbirine eþit");
		
		}
		if(num1/num2>1) {System.out.println("birinci sayý büyük");
		
		}
		if(num1/num2<1) {System.out.println("kesir");
		
		}
		scan.close();
	}
	
}
