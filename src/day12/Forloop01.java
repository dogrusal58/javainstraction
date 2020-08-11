package day12;

public class Forloop01 {

	public static void main(String[] args) {
		//ilk 30 sayma sayýsýnýn toplamýný ekrana yazdýrýnýz
		int sum = 0;
		for(int i= 1;i<=30;i++) {sum=sum+i;
		
		}
		System.out.println(sum);
		//sadece final sonucunu görmek isterseniz System.out.println(sum); ifadesini for-loop un dýþýna yazýn.
		//her loop tan sonrakitoplamý görmek isterseniz içine yazýn
		
		//ilk 10 sayma sayýsýnýn çarpýmýný yazdýralým.
		
		int j = 1;
		for(int k =1;k<=10;k++) { j=j*k;
		
		}
		System.out.println(j);

	}

}
