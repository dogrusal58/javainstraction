package day12;

public class Whileloop {

	public static void main(String[] args) {

//ilk 10 sayma say�s�n� b�y�kten k����e do�ru yazd�r�n�z.while-loop kullan�n
		int i =10;
		while(i>=1) {System.out.print(i + " ");
		i--;
		}
//yukar�daki loop da i++ yerine i-- al�rsan�z sonsuz d�ng�ye girersiniz.
		//while,iken demek
		// ilk y�z sayma say�s�n� yazd�ran program
		int k=100;
		while(k>=1) {System.out.print(k + " ");
		k--;
		
		//ilk y�z �ift sayma say�s�
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
		//j den �nceki k���k harfleri yazd�ral�m
		char m ='a';
		while(m<'j') { 
			System.out.print(m + " ");
		    m++;
		}

		
		//ilk 5 b�y�k harfin ascii de�erleri toplam�n� ekrana yazd�ran bir program...while loop kullan�n
		int sum = 0;
		char n = 'A';
		while(n<='E') {
			sum=sum+n;
			n++;
		
		}
		System.out.println(sum);
	}
}
