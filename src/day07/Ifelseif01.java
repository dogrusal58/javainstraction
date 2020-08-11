package day07;

import java.util.Scanner;

public class Ifelseif01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		double num = scan.nextDouble();
		
		if(num>0) { System.out.println("pozitif");
		
		}else if(num==0) { System.out.println("notr");
		
		}
		else {  System.out.println("negatif");
		
		}
		scan.close();
	}

}
