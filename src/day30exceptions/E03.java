package day30exceptions;

public class E03 {

	public static void main(String[] args) {
		
		String s = "12345";
		String t = "abcde";
		//integer wrapper class �n�n i�indeki parseInt() methodu String leri �evirmek i�in kullan�l�r.
		
		
		
		int i = Integer.parseInt(s);
		System.out.println(i+2);
		
		//e�er bir string rakamlardan olu�muyorsa ve onu say�ya �evirmek isterseniz
		//NumberFormatException al�rs�n�z.��nki rakam d���ndaki karakterleri parseInt()
		//methodu ile say�ya �eviremez.
		int j = Integer.parseInt(t);

	}

}
