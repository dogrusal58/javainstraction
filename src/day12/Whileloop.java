package day12;

public class Whileloop {

	public static void main(String[] args) {

//ilk 10 sayma sayısını büyükten küçüğe doğru yazdırınız.while-loop kullanın
		int i =10;
		while(i>=1) {System.out.print(i + " ");
		i--;
		}
//yukarıdaki loop da i++ yerine i-- alırsanız sonsuz döngüye girersiniz.
		//while,iken demek
		// ilk yüz sayma sayısını yazdıran program
		int k=100;
		while(k>=1) {System.out.print(k + " ");
		k--;
		
		//ilk yüz çift sayma sayısı
		int t = 1;
		int sayma = 1;
		while(sayma<=100) {
			if(t%2==0) {
				System.out.print(t+" ");
		        sayma++;
		}
		t++;
		}
	}
		//j den önceki küçük harfleri yazdıralım
		char m ='a';
		while(m<'j') { 
			System.out.print(m + " ");
		    m++;
		}

		
		//ilk 5 büyük harfin ascii değerleri toplamını ekrana yazdıran bir program...while loop kullanın
		int sum = 0;
		char n = 'A';
		while(n<='E') {
			sum=sum+n;
			n++;
		
		}
		System.out.println(sum);
	}
}
