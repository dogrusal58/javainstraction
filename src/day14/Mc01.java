package day14;

public class Mc01 {

	public static void main(String[] args) {
	toplama(3,5);//static method lar�n i�inde kullan�lan her�ey static olmal�d�r.
	cikarma(5,1);//method olu�tururken method parantezinin i�ine yazd���n�z variable lere parametre denir.
	carpma(3,4);//javada ayn� isimli metodlar olu�turabilirsiniz ama parametreleri farkl� olmal�
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
		System.out.println("ikinci �arpma metodu");
	}//parametre say�s�n� de�i�tirerek ayn� methodlar� kullanabilirsiniz.
	//parametre say�lar� ayn� oldu�u halde data typlerini de�i�tirerk de ayn� isimli methodlar olu�turabilirsiniz.
	//parametrelerin data type leri farkl� oldu�unda parametrelerin yerlerini de�i�tirerek ayn� isimli methodlar �retebilirsiniz.
	//note: parametreleri de�i�tirerek 1 den fazla ayn� isimli method �retmeye
	//  METHOD OVERLOAD�NG  denir.
	public static void carpma(int n1,double n2) {
		System.out.println("d�rd�nc� carpma methodu");
	}
	public static void carpma(double n1,int n2) {
		System.out.println("be�inci �arpma methodu");
	}
	}
	
/*1-)return type ler de�i�tirilerek method overloading yap�lmaz.yani ismi ve parametreleri ayn� olan 
 * iki method return typleri farkl� bile olsa java onlar� ayn� method kabul eder.
 * 2-)Access modifier lar de�i�tirilerek method overloading yap�lmaz.yani ismi ve parametreleri ayn� olan iki method 
 * access modifier lar� farkl� bile olsa java onlar� ayn� method kabul eder.
 * 3-)method body ler de�i�tirilerek method overloading yap�lmaz.yani ismi ve parametreleri ayn� olan 
 * iki method body leri farkl� bile olsa java onlar� ayn� method kabul eder.
 * note:method overloading ,ayn� isimli farkl� parametreli methodlar olabilir.
 * method overloading compile time polymorphism dir.
 */
//java y� yazanlar ayn� isimli method kullanman�n faydas�n� g�rm��ler.	
