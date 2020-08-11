package day10;

public class StringMethod01 {

	public static void main(String[] args) {
		//charAt() metodu stringten istedi�imiz karakteri index kullanarak, se�ip almaya yarar.
		String s = "Java ah Java!";
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(9));
		//System.out.println(s.charAt(13));//run time error verir.
		/*bazen kod yazarken k�rm�z� alt �izgi al�r�z.bu hata yap�yoruz demekltir.(compile time error)(cpt)
		 * bazen de cpt almay�z,kodu �al��t�rd�ktan sonra console da k�rm�z� mesajlar al�r�z.bu mesajlar da hata yapt���m�z anlam�na gelir.kod run 
		 edildikten sonra al�nd��� i�in run time error olarak adland�r�l�r.
		 *var olmayan bir index kullan�rsan�z run time error al�rs�n�z.
		
		
		*/
		String t ="Hayat ah Hayat!";
		System.out.println(t.contains("y"));
		System.out.println(t.contains("z"));
		System.out.println(t.contains("yat"));
		//contains methodu bir karakter veya katakterlerin verinin i�inde bulunup bulunmad���n� bildirir.sonucu true veya false dir.
		
		String u = "G�zel Gunler!";
		System.out.println(u.endsWith("!"));
		System.out.println(u.endsWith("ler!"));//bu method son karakterleri sorgular.sonucu true veya falsedir
		
		//lenght metodu.bir stringdeki karakterlerin say�s�n� bulmaya yarar
		String v = "Hey gidi g�nler!";
		System.out.println(v.length());
		//toLowerCase metodu 
		String z = "Evde Kal!";
		System.out.println(z.toLowerCase());
		//replace() metodu bir stringteki bir veya birden fazla karakterin yerine ba�ka bir karakter yazmaya yarar
		String a = "Bir �eyler oldu!";
		System.out.println(a.replace("Bir", "�ok"));
		System.out.println(a.replace("e", "a"));
		System.out.println(a.replace("Bir", "Acaip"));
		System.out.println(a.replace("bir", "acaip"));//b�y�k k���k harf duyarl�l��� var.
		System.out.println(a.replace('r', 'n'));//replace metodunda char kullan�labilir.tek t�rnak.
		System.out.println(a.replace("e", ""));//e yerine hi� bir �ey yazd�.bu metodu kullanarak istenilen bir karakterin tamam� silinebilir.
		
		//replaceAll() metodu,replace() metodu ile ayn� i�i yapar.farklar�
		//farklar� replaceAll metodu char kabul etmez.sadece string ve regex()(regular expressions) kullan�r.
		//replace metodu regex kabul etmez.sadece char ve string kabul eder.
		String b = "Java 1257 ?!@$_";
		System.out.println(b.replaceAll("\\d", "*"));
		// "\\d" ifadesi t�m rakamlar anlam�ndad�r.d:digit
		//"\\D" ifadesi rakamlar d���ndaki her�ey demektir.
		System.out.println(b.replaceAll("\\D", "*"));
		//"\\S" ifadesi space d���ndaki her �ey demektir
		//"\\s" ifadesi space leri de�i�tirir
		System.out.println(b.replaceAll("\\S", "*"));
		System.out.println(b.replaceAll("\\s", "*"));
		//"\\w"
				
	}

}
