package day13;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*kullan�c�dan bir say� al�n ve bu rakam i�in �arp�m tablosunu ekrana yazd�r�n.
		 * kullan�c�n�n hata yapmad���n� farz edin;�rnek olarak kullan�c� 3 girerse
		 * 3*1=3,3*2=6...3*10=30
		 */
Scanner scan =new Scanner(System.in);
System.out.println("bir say� giriniz");
int s= scan.nextInt();
int i = 1;
while(i<=10) {System.out.println(s + "x" + i + "=" + s*i);
i++;
}
scan.close();
	}

}
