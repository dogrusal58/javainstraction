package day07;

import java.util.Scanner;

public class Ifelseif031 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ya��n�z� giriniz");
		int  yas = scan.nextInt();
		if(yas<0) {System.out.println("ya� negatif olamaz");
		} else if(yas<13) {System.out.println("�al��amaz");
		} else if(yas<65) {System.out.println("�al��abilir");
		
		}else {System.out.println("emekli");
		}
		
		scan.close();
	}
}

	


