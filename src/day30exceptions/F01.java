package day30exceptions;

public class F01 {

	
		/*
	final ,finally ve finalize() aras�ndaki farklar nelerdir
	final ve finally keyworddur.finalize() methoddur.
	
	final: final keywordu variable lardan,methodlardan ve class lardan �nce kullan�labilir
	1-)final variable : bir variable final ise o variable e bir kere de�er atamas� yapars�n�z
	bir daha o de�eri de�i�tiremezsiniz.
	2-)final method : Body si son halde olan methodlard�r.yani body si de�i�tirilemeyecek olam 
	methodlard�r.final methodlar override edilemezler.
	3-)final class: Child i olamaz.Inheritance yap�lmaz.
	
	finally:try-catch den sonra kullan�l�r.try block exception �retse de
	 finally block i�indeki kod �al���r.
	 
	 finalize() :(methoddur)java da Garbage Collector silmesi gereken data lar� �nce finalize eder
	 sonra imha eder
	 
		 */
	final static double pi = 3.14;
	
	
	
	
	
	public static void main(String[] args) {
	//pi = 7; alt�n� k�rm�z� �izer.
	
	
	
	
	
	}

}
