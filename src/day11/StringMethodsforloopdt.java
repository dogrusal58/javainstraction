package day11;

public class StringMethodsforloopdt {

	public static void main(String[] args) {
		//startsWith() metodu ilk karakteri kontrol eder
		String a = "Hadi gidelim bu diyardan!";
		
		
		System.out.println(a.startsWith("H"));
		System.out.println(a.startsWith(""));
		System.out.println(a.startsWith("Hadi"));
		System.out.println(a.startsWith("g", 5));
		System.out.println(a.startsWith("i", 7));
		System.out.println(a.startsWith("", 6));
		
		//indexOf() metodu görünümün indexini verir
		System.out.println(a.indexOf("i"));
		System.out.println(a.indexOf('d'));
		System.out.println(a.indexOf("deli"));
		//birden fazla karakter girerseniz ilk harfin indexini verir
		System.out.println(a.indexOf("x"));
		//olmayan bir karakterin indexini -1 verir.
		System.out.println(a.indexOf("diyer"));
		System.out.println(a.indexOf('w'));
		
		System.out.println(a.indexOf("d", 4));//4. karakterden sonra d nerede cevap 7 olur
		System.out.println(a.indexOf('e', 8));//8.karakterden sonra e nerde cevabý 8 verir.
		
		//lastIndexOf() metodu son görünümün indexini verir.
		String b = "Java ah Java!";
		System.out.println(b.lastIndexOf("v"));//son v yi bulur.indexini verir.
		System.out.println(b.lastIndexOf("av"));//9
		
		
		//substring() metodu bir stringin belli bir bölümünü kesip almaya yarar.
		String c = "Karakartal";//sadece kartal kelimesini ekrana yazdýrýn
		System.out.println(c.substring(4));//kartal, 4e kadar olan indexi keser.
		//ekrana "arakartal" yazdýrýn.
		System.out.println(c.substring(1));//0 ve 1 i keser.
		//ekrana "kar" yazdýrýn.
		System.out.println(c.substring(4, 7));//kar
		//substring() metodu ile ilk harfi almak için(0,1) yazarýz
		System.out.println(c.substring(0, 1));
		
		System.out.println(c.substring(2, 2));//"" hiç bir þey verir
		//System.out.println(c.substring(5, 3));//baþlangýç bitiþten büyük olamaz
		
		//trim() metodu bir stringin baþ ve son taraflarýndaki sbaceleri siler.dikkat edin aradakileri deðil sadece baþ ve sondakileri
		
		String d = "   Java iyidir  ";
		System.out.println(d.trim().length());
	}

}
