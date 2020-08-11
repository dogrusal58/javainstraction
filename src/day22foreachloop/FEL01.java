package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {
		List<Integer> il = new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		System.out.println(il);//[21, 22, 23]
		//for-each loop = Enhanced loop
		for(Integer w : il ) {
			System.out.println(w);//21
			                      //22
		                          //23 
		}
		
		//il listinin t�m elemanlar�n� toplay�n�z.
		int sum = 0;
		for(Integer w : il ) {
			sum = sum + w;
			
		}
		System.out.println(sum);
		//il listinin i�indeki tek say� olan elemanlar�n �arp�m�
		int pr = 1;
		for(Integer w : il ) {
			if(w%2!=0) {
				pr =pr*w ;
			
		}
			System.out.println(pr);
			
		}
		
		//il listinin i�indeki tek say�lar� yazd�r�n
		for(Integer w : il ) {
			if(w%2!=0) {
				System.out.println(w);
			}
			
		}
		//for-each loop array lerde kullan�lmaz
		
		//break ve continiue kullan�lmas�
		int count = 0 ; // saymak demek
		for(Integer w : il ) {
			if(count<3) { System.out.print(w+" ");
			count++;
				
			}
		}
		//ayn� soruyu di�er bir yol
		int c = 0;//c yi count k�saltmas� olarak kulland�k
		for(int w : il ) {
			System.out.println(w);
			c++;
			if(c==3) {
				break;
			}
		}
		//il listinde 3 ile b�l�nebilenleri ekrana yazd�ral�m
		for(Integer w : il ) {
			if(w%3==0) {
				System.out.print(w + " ");
			}
			
		}
		//2. yol :
		
		
		//3.yol
		for(Integer w : il ) {
			if(w%3==0) {
				continue;
			}
				System.out.print(w + " ");
		 }
		
	}

}
