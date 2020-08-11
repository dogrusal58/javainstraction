package day30exceptions;

public class F01 {

	
		/*
	final ,finally ve finalize() arasýndaki farklar nelerdir
	final ve finally keyworddur.finalize() methoddur.
	
	final: final keywordu variable lardan,methodlardan ve class lardan önce kullanýlabilir
	1-)final variable : bir variable final ise o variable e bir kere deðer atamasý yaparsýnýz
	bir daha o deðeri deðiþtiremezsiniz.
	2-)final method : Body si son halde olan methodlardýr.yani body si deðiþtirilemeyecek olam 
	methodlardýr.final methodlar override edilemezler.
	3-)final class: Child i olamaz.Inheritance yapýlmaz.
	
	finally:try-catch den sonra kullanýlýr.try block exception üretse de
	 finally block içindeki kod çalýþýr.
	 
	 finalize() :(methoddur)java da Garbage Collector silmesi gereken data larý önce finalize eder
	 sonra imha eder
	 
		 */
	final static double pi = 3.14;
	
	
	
	
	
	public static void main(String[] args) {
	//pi = 7; altýný kýrmýzý çizer.
	
	
	
	
	
	}

}
