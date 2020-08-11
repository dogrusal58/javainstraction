package day14;

public class InstanceLocalVariables01 {
	
	int i =12;//instance variable(main methodun dýþýnda olur)

	public static void main(String[] args) {
		/*1-)instance(görünüm/object) variable = object variable
		 * 2-)main methodun dýþýonda class ýn içinde üretilen variable lere ,nstance variable denir
		 * 3-)instance variable ler classýn içindeki tüm methodlar tarafýndan kullanýlabilir.yani baþta bir kere yazmanýz yeterli.
		 */
		/*1-)local variable= methodun body si içinde veya methodun method parantezi içinde üretilebilen variable dir. 
		 * 2-)local variable ler sadece method body si içinde kullanýlabilir.
		 */
		/*instance variablelerin scope u classýn her yeridir.classýn içinde her yerde kullanýlabilir.
		 * local variable ler scope u içinde bulunduklarý methodun body sidir.
		 * note: instance variablelere deðer atamasý yapmazsanýz java onlara default deðer atamasý yapar.
		 * ama local variablelere deðer atamasý yapmazsanýz java onlara deðer atamasý yapmaz ve o variable kullanmak isterseniz
		 * compile time error verir.
		 */

	}
	public void toplama() {i++;System.out.println("toplama");
	
	}
public void cikarma() {i--;System.out.println("çýkarma");

}
}
