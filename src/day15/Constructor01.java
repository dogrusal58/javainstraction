package day15;

public class Constructor01 {
	Constructor01()  {
		System.out.println("toplama");
		
	}
	 Constructor01 (int i) {
		System.out.println("cikarma");
	}
	Constructor01 (String s){ System.out.println("carpma");
	
	}
	Constructor01(String s,int i){
		System.out.println("bolme");
		
	}
	//1-)Constructor main methodun d���nda olu�turulur.
	//2-)Constructor un ismi class �n ismi ile ayn� olmal�
	//3-)Method ile costructor fark�
	//a-)method ismi class isminden farkl� olabilir ama cons ismi ayn� olaml�.(m�lakat sorusu)
	//b-)method larda return type olmak zorundad�r.ama cons larda olmaz.ba��na return type 
	//kullan�rsan�z java onu method olarak g�r�r.(return type=voide)
	//bir classda birden fazla constructor olabilir.ama parametreleri farkl� olmal�d�r.
	//bir tane class kullanarak farkl� farkl� objeler �retebiliyoruz.

	public static void main(String[] args) {
		//Class ismi         object e bir isim verin   =   new keywordunu kullan�n       Constructor
		//Scanner                   scan               =   new                            Scanner(System.in);
		//(2. madde class ve cons ismi ayn� olmal�.1. Scanner class ismi 2. Scanner constructor.)
		Constructor01        obj  = new Constructor01();
		Constructor01        obj01 = new Constructor01();
		Constructor01        obj02 = new Constructor01("ali");
  		Constructor01        obj03 = new Constructor01(5);
  		Constructor01        obj04 = new Constructor01(" ",12);

	}

}

