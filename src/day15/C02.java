package day15;

public class C02 {
	/*Classolu�turdu�umuzda java bizim kesinlikle object �retece�imizi d���n�r ve class ile beraber 
	 * g�r�nmez bir constructor olu�turur.bu parametresiz constructor ismi defult constructor d�r
	 * 
	 * kendimiz herhangi bir condtructor olu�turursak java defult olan� iptal eder
	 * 
	 */
       
	C02(int i){ System.out.println();
	
	}
	public static void main(String[] args) {
		//C02 obj1 = new C02();//�u an biz cons tan�mlamad���m�z i�in defult cons kulland�.ama biz yukar�d CONS tan�mlarsak hata verir.
        C02 obj1 = new C02(5);//�idi bizim yazd���m�z cons �al��t�.
	}

}
