package day07;

import java.util.Scanner;

public class Ifelseifodev {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("birinci kenar uzun. giriniz");
		float k1 = scan.nextFloat();
		
		System.out.println("ikinci kenar uzun. giriniz");
		float k2 = scan.nextFloat();
		
		System.out.println("üçüncü kenar uzun. giriniz");
        float k3 = scan.nextFloat();
        
        if(k1==k2 && k2==k3) {System.out.println("eþkenar üçgen");
        
        }else if(k1==k2 ||k2==k3 ||k1==k3) {System.out.println("ikizkenar üçgen");
        
        }else {System.out.println("çeþitkenar üçgen");
        
        }
        scan.close();
	}

}
