package Day09;

import java.util.Scanner;

public class Nestedternary02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� kenar uzunlu�u giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
		String result = (k1==k2 && k2==k3) ? ((k1+k2+k3>30) ? ("ne b�y�ks�n"):("normal")): ((k1+k2+k3<20) ? ("ne k���ks�n"):("normal"));
		System.out.println(result);
		scan.close();
	}

}
