package day14;

public class InstanceLocalVariables01 {
	
	int i =12;//instance variable(main methodun d���nda olur)

	public static void main(String[] args) {
		/*1-)instance(g�r�n�m/object) variable = object variable
		 * 2-)main methodun d���onda class �n i�inde �retilen variable lere ,nstance variable denir
		 * 3-)instance variable ler class�n i�indeki t�m methodlar taraf�ndan kullan�labilir.yani ba�ta bir kere yazman�z yeterli.
		 */
		/*1-)local variable= methodun body si i�inde veya methodun method parantezi i�inde �retilebilen variable dir. 
		 * 2-)local variable ler sadece method body si i�inde kullan�labilir.
		 */
		/*instance variablelerin scope u class�n her yeridir.class�n i�inde her yerde kullan�labilir.
		 * local variable ler scope u i�inde bulunduklar� methodun body sidir.
		 * note: instance variablelere de�er atamas� yapmazsan�z java onlara default de�er atamas� yapar.
		 * ama local variablelere de�er atamas� yapmazsan�z java onlara de�er atamas� yapmaz ve o variable kullanmak isterseniz
		 * compile time error verir.
		 */

	}
	public void toplama() {i++;System.out.println("toplama");
	
	}
public void cikarma() {i--;System.out.println("��karma");

}
}
