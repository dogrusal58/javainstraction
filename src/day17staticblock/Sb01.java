package day17staticblock;

public class Sb01 {


		/*Farzedelim ki bu class dairenin çevre ve alanýný hesaplayacak
		 * alan = pi*r*r cevre = 2*pi*r
		 * bu class da pi sayýsý her saman kullanýlacaktýr.pi sayýsýnaclass uretirken deðer atamasýný yapmak faydalýdýr.eðer class üretilirken
		 * deðer atamasýný yapmak faydalýdýr.eðer claa üretilirken bazý veriablelere bdeðer atamasý yapýlmasýný isterseniz static blok kullanmalýsýnýz
		 */
		static double pi ;
		
		Sb01(){
			System.out.println("constructor");
		}
		static {//static block içindeki herþey static olmalýdýr.
			//bu yüzden bu örnekte pi veriablesini static yapmak zorundayýz.
			//static block main method dan ve diðer bütün method ve constructorlardan önce çalýþýr.
			//static block class oluþturulurken çalýþýr.
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
