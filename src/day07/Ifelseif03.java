package day07;

import java.util.Scanner;

public class Ifelseif03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("yaşınızı giriniz");
		int  yas = scan.nextInt();
		if(yas>0 && yas<13) {System.out.println("çalışamaz");
	
		}else if(yas>=13 && yas<65) {System.out.println("çalışabilir");
		
		}else if(yas>65) {System.out.println("emekli");
		
		}else if(yas<0) {System.out.println("yaş negatif olamaz");
		
		}
scan.close();
	}
}


		
