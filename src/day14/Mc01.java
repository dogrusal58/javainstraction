package day14;

public class Mc01 {

	public static void main(String[] args) {
	toplama(3,5);//static method larýn içinde kullanýlan herþey static olmalýdýr.
	cikarma(5,1);//method oluþtururken method parantezinin içine yazdýðýnýz variable lere parametre denir.
	carpma(3,4);//javada ayný isimli metodlar oluþturabilirsiniz ama parametreleri farklý olmalý
	String str = "Ali";
	
	}
	public static void toplama(int n1,int n2) {
		System.out.println(n1+n2);
		
	}
	public static void cikarma(int n1,int n2) {
		System.out.println(n1-n2);
		
	}
	public static void carpma(int n1,int n2) {
		System.out.println(n1*n2);
	}
	public static void carpma(int n1) {
		System.out.println("ikinci çarpma metodu");
	}//parametre sayýsýný deðiþtirerek ayný methodlarý kullanabilirsiniz.
	//parametre sayýlarý ayný olduðu halde data typlerini deðiþtirerk de ayný isimli methodlar oluþturabilirsiniz.
	//parametrelerin data type leri farklý olduðunda parametrelerin yerlerini deðiþtirerek ayný isimli methodlar üretebilirsiniz.
	//note: parametreleri deðiþtirerek 1 den fazla ayný isimli method üretmeye
	//  METHOD OVERLOADÝNG  denir.
	public static void carpma(int n1,double n2) {
		System.out.println("dördüncü carpma methodu");
	}
	public static void carpma(double n1,int n2) {
		System.out.println("beþinci çarpma methodu");
	}
	}
	
/*1-)return type ler deðiþtirilerek method overloading yapýlmaz.yani ismi ve parametreleri ayný olan 
 * iki method return typleri farklý bile olsa java onlarý ayný method kabul eder.
 * 2-)Access modifier lar deðiþtirilerek method overloading yapýlmaz.yani ismi ve parametreleri ayný olan iki method 
 * access modifier larý farklý bile olsa java onlarý ayný method kabul eder.
 * 3-)method body ler deðiþtirilerek method overloading yapýlmaz.yani ismi ve parametreleri ayný olan 
 * iki method body leri farklý bile olsa java onlarý ayný method kabul eder.
 * note:method overloading ,ayný isimli farklý parametreli methodlar olabilir.
 * method overloading compile time polymorphism dir.
 */
//java yý yazanlar ayný isimli method kullanmanýn faydasýný görmüþler.	
