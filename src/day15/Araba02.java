package day15;

public class Araba02 {
	int yil = 2019;//bu kýsým defult cons a göre
	String marka = "Toyota";//
	String model = "Rav4";//
	int price = 20000;//
	
	Araba02(String model, int price) {//þu an cons oluþturdum.artýk model ve fiyat dinamik oldu.
		this.model = model;
		this.price = price;
	}
	Araba02(String model,int yil,String marka,int price){
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.price = price;
	}
	Araba02(){
		
	}
	
	

	public static void main(String[] args) {
		Araba02 a1 = new Araba02();//Scanner scan = new scanner(); buna benzet//bu defult cons
	    System.out.println("Fiyat: " + a1.price);
	    System.out.println("Marka: " + a1.marka);
	    System.out.println("Model: " + a1.model);
	    System.out.println("Yil: "+ a1.yil);
        a1.hizlanma(8);
        a1.tuketim();
        System.out.println("- - - - - - - -  - - - - - - - - ");
        
        Araba02 a2 = new Araba02("corolla",12000);//
	    System.out.println("Fiyat: " + a2.price);
	    System.out.println("Marka: " + a2.marka);
	    System.out.println("Model: " + a2.model);
	    System.out.println("Yil: "+ a2.yil);
        a2.hizlanma(10);
        a2.tuketim();
        System.out.println("- - - - - - - - - - - - - - -  - -");
        
        Araba02 a3 = new Araba02("a8",2020,"audi",50000);
        System.out.println("Fiyat: " + a3.price);
	    System.out.println("Marka: " + a3.marka);
	    System.out.println("Model: " + a3.model);
	    System.out.println("Yil: "+ a3.yil);
        a3.hizlanma(7);
        a3.tuketim();
	}
	
	public void hizlanma(int i) {
		System.out.println(i +" sn de 100km/sa e ulaþýr");
		
	}
    public void tuketim() {
	 System.out.println("km de 0.1 dolar yakar");
	 
	 
 }
}
