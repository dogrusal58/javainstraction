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
		
		//il listinin tüm elemanlarýný toplayýnýz.
		int sum = 0;
		for(Integer w : il ) {
			sum = sum + w;
			
		}
		System.out.println(sum);
		//il listinin içindeki tek sayý olan elemanlarýn çarpýmý
		int pr = 1;
		for(Integer w : il ) {
			if(w%2!=0) {
				pr =pr*w ;
			
		}
			System.out.println(pr);
			
		}
		
		//il listinin içindeki tek sayýlarý yazdýrýn
		for(Integer w : il ) {
			if(w%2!=0) {
				System.out.println(w);
			}
			
		}
		//for-each loop array lerde kullanýlmaz
		
		//break ve continiue kullanýlmasý
		int count = 0 ; // saymak demek
		for(Integer w : il ) {
			if(count<3) { System.out.print(w+" ");
			count++;
				
			}
		}
		//ayný soruyu diðer bir yol
		int c = 0;//c yi count kýsaltmasý olarak kullandýk
		for(int w : il ) {
			System.out.println(w);
			c++;
			if(c==3) {
				break;
			}
		}
		//il listinde 3 ile bölünebilenleri ekrana yazdýralým
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
