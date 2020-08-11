package day15;

public class Araba {//þu an defult constructor kullanýlýyor.
	int yil = 2019;
	String marka = "Toyota";
	String model = "Rav4";
	int price = 20000;
	

	public static void main(String[] args) {
		Araba a1 = new Araba();
	    System.out.println("Fiyat: " + a1.price);
	    System.out.println("Marka: " + a1.marka);
	    System.out.println("Model: " + a1.model);
	    System.out.println("Yil: "+ a1.yil);
        a1.hizlanma();
        a1.tuketim();


	}
	
	public void hizlanma() {
		System.out.println("7 sn de 100km/sa e ulaþýr");
		
	}
    public void tuketim() {
	 System.out.println("km de 0.1 dolar yakar");
	 
	 
 }
}
