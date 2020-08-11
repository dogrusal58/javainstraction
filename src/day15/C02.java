package day15;

public class C02 {
	/*Classoluþturduðumuzda java bizim kesinlikle object üreteceðimizi düþünür ve class ile beraber 
	 * görünmez bir constructor oluþturur.bu parametresiz constructor ismi defult constructor dýr
	 * 
	 * kendimiz herhangi bir condtructor oluþturursak java defult olaný iptal eder
	 * 
	 */
       
	C02(int i){ System.out.println();
	
	}
	public static void main(String[] args) {
		//C02 obj1 = new C02();//þu an biz cons tanýmlamadýðýmýz için defult cons kullandý.ama biz yukarýd CONS tanýmlarsak hata verir.
        C02 obj1 = new C02(5);//þidi bizim yazdýðýmýz cons çalýþtý.
	}

}
