package Day09;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		//kullan�c� ay ismini girince o ay�n mevsimini veren program
		//switch lerde boolean,float,double,long kullan�lmaz.char,byte,short,int ve string kullan�l�r
		Scanner scan = new Scanner(System.in);
		System.out.println("ay ismini girniz");
		String ay = scan.nextLine();
		switch(ay) {
		case "ocak" :
		case "�ubat" :
		case "aral�k" :
			System.out.println("k��");
			break;
		case "mart":
		case "nisan":
		case "may�s":
			System.out.println("ilk bahar");
			break;
		case "haziran":
		case "temmuz":
		case "a�ustos":
			System.out.println("yaz");
			break;
		case "eyl�l":
		case "ekim":
		case "kas�m":
			System.out.println("son bahar");
			break;
			default:
				System.out.println("ge�erli ay ismi girin");
				
		}
		scan.close();

	}

}
