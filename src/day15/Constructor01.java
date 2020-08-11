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
	//1-)Constructor main methodun dýþýnda oluþturulur.
	//2-)Constructor un ismi class ýn ismi ile ayný olmalý
	//3-)Method ile costructor farký
	//a-)method ismi class isminden farklý olabilir ama cons ismi ayný olamlý.(mülakat sorusu)
	//b-)method larda return type olmak zorundadýr.ama cons larda olmaz.baþýna return type 
	//kullanýrsanýz java onu method olarak görür.(return type=voide)
	//bir classda birden fazla constructor olabilir.ama parametreleri farklý olmalýdýr.
	//bir tane class kullanarak farklý farklý objeler üretebiliyoruz.

	public static void main(String[] args) {
		//Class ismi         object e bir isim verin   =   new keywordunu kullanýn       Constructor
		//Scanner                   scan               =   new                            Scanner(System.in);
		//(2. madde class ve cons ismi ayný olmalý.1. Scanner class ismi 2. Scanner constructor.)
		Constructor01        obj  = new Constructor01();
		Constructor01        obj01 = new Constructor01();
		Constructor01        obj02 = new Constructor01("ali");
  		Constructor01        obj03 = new Constructor01(5);
  		Constructor01        obj04 = new Constructor01(" ",12);

	}

}

