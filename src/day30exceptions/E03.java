package day30exceptions;

public class E03 {

	public static void main(String[] args) {
		
		String s = "12345";
		String t = "abcde";
		//integer wrapper class ýnýn içindeki parseInt() methodu String leri çevirmek için kullanýlýr.
		
		
		
		int i = Integer.parseInt(s);
		System.out.println(i+2);
		
		//eðer bir string rakamlardan oluþmuyorsa ve onu sayýya çevirmek isterseniz
		//NumberFormatException alýrsýnýz.çünki rakam dýþýndaki karakterleri parseInt()
		//methodu ile sayýya çeviremez.
		int j = Integer.parseInt(t);

	}

}
