package Day09;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		//kullanýcý ay ismini girince o ayýn mevsimini veren program
		//switch lerde boolean,float,double,long kullanýlmaz.char,byte,short,int ve string kullanýlýr
		Scanner scan = new Scanner(System.in);
		System.out.println("ay ismini girniz");
		String ay = scan.nextLine();
		switch(ay) {
		case "ocak" :
		case "þubat" :
		case "aralýk" :
			System.out.println("kýþ");
			break;
		case "mart":
		case "nisan":
		case "mayýs":
			System.out.println("ilk bahar");
			break;
		case "haziran":
		case "temmuz":
		case "aðustos":
			System.out.println("yaz");
			break;
		case "eylül":
		case "ekim":
		case "kasým":
			System.out.println("son bahar");
			break;
			default:
				System.out.println("geçerli ay ismi girin");
				
		}
		scan.close();

	}

}
