package day07;

import java.util.Scanner;

public class Ifelseif02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz");
		char harf = scan.next().charAt(0); 
		
		if(harf=='a' || harf=='A') {System.out.println("ilk harf");
		
		}
		else if(harf=='b' || harf=='B') {System.out.println("ikinvi harf");
		
		}else if( harf == 'c' || harf=='C' ) {System.out.println("üçüncü harf");
		
		}else {System.out.println("sýrasýný bilmiyorum");
		
		}
		scan.close();
	} 
	

}
