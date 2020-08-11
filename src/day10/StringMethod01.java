package day10;

public class StringMethod01 {

	public static void main(String[] args) {
		//charAt() metodu stringten istediðimiz karakteri index kullanarak, seçip almaya yarar.
		String s = "Java ah Java!";
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(9));
		//System.out.println(s.charAt(13));//run time error verir.
		/*bazen kod yazarken kýrmýzý alt çizgi alýrýz.bu hata yapýyoruz demekltir.(compile time error)(cpt)
		 * bazen de cpt almayýz,kodu çalýþtýrdýktan sonra console da kýrmýzý mesajlar alýrýz.bu mesajlar da hata yaptýðýmýz anlamýna gelir.kod run 
		 edildikten sonra alýndýðý için run time error olarak adlandýrýlýr.
		 *var olmayan bir index kullanýrsanýz run time error alýrsýnýz.
		
		
		*/
		String t ="Hayat ah Hayat!";
		System.out.println(t.contains("y"));
		System.out.println(t.contains("z"));
		System.out.println(t.contains("yat"));
		//contains methodu bir karakter veya katakterlerin verinin içinde bulunup bulunmadýðýný bildirir.sonucu true veya false dir.
		
		String u = "Güzel Gunler!";
		System.out.println(u.endsWith("!"));
		System.out.println(u.endsWith("ler!"));//bu method son karakterleri sorgular.sonucu true veya falsedir
		
		//lenght metodu.bir stringdeki karakterlerin sayýsýný bulmaya yarar
		String v = "Hey gidi günler!";
		System.out.println(v.length());
		//toLowerCase metodu 
		String z = "Evde Kal!";
		System.out.println(z.toLowerCase());
		//replace() metodu bir stringteki bir veya birden fazla karakterin yerine baþka bir karakter yazmaya yarar
		String a = "Bir þeyler oldu!";
		System.out.println(a.replace("Bir", "Çok"));
		System.out.println(a.replace("e", "a"));
		System.out.println(a.replace("Bir", "Acaip"));
		System.out.println(a.replace("bir", "acaip"));//büyük küçük harf duyarlýlýðý var.
		System.out.println(a.replace('r', 'n'));//replace metodunda char kullanýlabilir.tek týrnak.
		System.out.println(a.replace("e", ""));//e yerine hiç bir þey yazdý.bu metodu kullanarak istenilen bir karakterin tamamý silinebilir.
		
		//replaceAll() metodu,replace() metodu ile ayný iþi yapar.farklarý
		//farklarý replaceAll metodu char kabul etmez.sadece string ve regex()(regular expressions) kullanýr.
		//replace metodu regex kabul etmez.sadece char ve string kabul eder.
		String b = "Java 1257 ?!@$_";
		System.out.println(b.replaceAll("\\d", "*"));
		// "\\d" ifadesi tüm rakamlar anlamýndadýr.d:digit
		//"\\D" ifadesi rakamlar dýþýndaki herþey demektir.
		System.out.println(b.replaceAll("\\D", "*"));
		//"\\S" ifadesi space dýþýndaki her þey demektir
		//"\\s" ifadesi space leri deðiþtirir
		System.out.println(b.replaceAll("\\S", "*"));
		System.out.println(b.replaceAll("\\s", "*"));
		//"\\w"
				
	}

}
