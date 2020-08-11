package day13;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*kullanýcýdan bir sayý alýn ve bu rakam için çarpým tablosunu ekrana yazdýrýn.
		 * kullanýcýnýn hata yapmadýðýný farz edin;örnek olarak kullanýcý 3 girerse
		 * 3*1=3,3*2=6...3*10=30
		 */
Scanner scan =new Scanner(System.in);
System.out.println("bir sayý giriniz");
int s= scan.nextInt();
int i = 1;
while(i<=10) {System.out.println(s + "x" + i + "=" + s*i);
i++;
}
scan.close();
	}

}
