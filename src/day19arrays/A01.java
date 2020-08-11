package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		// Array elemanlar�n� k���kten b�y��e s�ralayal�m
		//konumuz array ise arad���m�z �ey i�in arrays k�lasa gidece�iz
		//s�ralamak=sorting(her zaman k���kten b�y��e dizer)
		
		int arr[] = {3,7,1,18};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String srr [] = {"ali","veli","k�rkdokuz","elli"};
		Arrays.sort(srr);
		System.out.println(Arrays.toString(srr));
		
		int irr[] = {13,9,6,18,23,7,11};
		Arrays.sort(irr);
		System.out.println(Arrays.toString(irr));
		System.out.println("En k���k: " + irr[0]);//indexi 0 olan yani ilk terim
		System.out.println("En b�y�k: " + irr[irr.length-1]);//indexi enson olan eleman
		
		String srr2 [] = {"ali","veli","deli","seni","beni"};//ba�tan ve sondan ikinci eleman�n� yazd�ral�m
		System.out.println(Arrays.toString(srr2));
		System.out.println("Ba�tan ikinci : " + srr2[1]);
		System.out.println("Sondan ikinci : " + srr2[3]);
		
		
		
		//bir eleman�n arrayde olup olmad���n� kontrol edelim.
		int nrr[] = {2,1,7,3,5};
		// nrr array inde 7 var m� kontrol edelim
		
		//1. yol loop ile
		int count = 0;
		for(int i = 0; i<nrr.length;i++) {
			if(nrr[i]==7) {
				count++;
				
			}
		}
		 if(count!=0) {
			System.out.println("7 eleman olarak var");
			
			
		}else {
			System.out.println("7 eleman olarak yok");
		}
// 2.yol binarySearch() kullanmak.
/*a-)�nce kesinlikle sort() kullanmal�s�n�z
 * b-)arad���m�z eleman array de varsa binarySearch() o eleman�n indexini verir.
*/		 
		 
		Arrays.sort(nrr); 
		System.out.println(Arrays.binarySearch(nrr,7));//index 4 olur.�nce sort ettik sonra yeni array deki indexi verdi.
//binarySearch() eleman varsa pozitif de�er output eder
//e�er eleman yoksa negatif de�er output eder
		System.out.println(Arrays.binarySearch(nrr,6));//-5
		System.out.println(Arrays.binarySearch(nrr,99));//-6
//note:bir array de tekrarl� elemanlar varsa binary searchmethodu eleman�n var olup olmad��� hakk�nda do�ru karar verebilir
		// ama o eleman�n s�ras� hakk�nda yan�l�r
		
		
		
	
	}

}
