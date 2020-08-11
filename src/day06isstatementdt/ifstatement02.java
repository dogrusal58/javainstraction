package day06isstatementdt;

import java.util.Scanner;

public class ifstatement02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gün giriniz");
		String gun = scan.next();
		if(gun.equals("cuma"))
		{
			System.out.println("müslümanlar için kutsal gün");
		}
if(gun.equals("cumartesi")) {
	System.out.println("hristyanlar için kutsal gün");
	
}
if(gun.equals("pazar")){
	System.out.println("museviler için kutsal gün");
}
scan.close();
	}

}
