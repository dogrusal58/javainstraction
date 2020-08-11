package day17staticblock;

public class Sb01 {


		/*Farzedelim ki bu class dairenin �evre ve alan�n� hesaplayacak
		 * alan = pi*r*r cevre = 2*pi*r
		 * bu class da pi say�s� her saman kullan�lacakt�r.pi say�s�naclass uretirken de�er atamas�n� yapmak faydal�d�r.e�er class �retilirken
		 * de�er atamas�n� yapmak faydal�d�r.e�er claa �retilirken baz� veriablelere bde�er atamas� yap�lmas�n� isterseniz static blok kullanmal�s�n�z
		 */
		static double pi ;
		
		Sb01(){
			System.out.println("constructor");
		}
		static {//static block i�indeki her�ey static olmal�d�r.
			//bu y�zden bu �rnekte pi veriablesini static yapmak zorunday�z.
			//static block main method dan ve di�er b�t�n method ve constructorlardan �nce �al���r.
			//static block class olu�turulurken �al���r.
			pi =3.14;
			System.out.println("Static block Ali");
		}
		public static void main(String[] args) {
			System.out.println("Main method");
			Sb01 obj = new Sb01();
			Sb01 obj2 = new Sb01();
			
	}
		static {
			pi =3.14;
			System.out.println("Static block Veli");
		}

}
