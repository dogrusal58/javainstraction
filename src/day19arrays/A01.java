package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		// Array elemanlarýný küçükten büyüðe sýralayalým
		//konumuz array ise aradýðýmýz þey için arrays kýlasa gideceðiz
		//sýralamak=sorting(her zaman küçükten büyüðe dizer)
		
		int arr[] = {3,7,1,18};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String srr [] = {"ali","veli","kýrkdokuz","elli"};
		Arrays.sort(srr);
		System.out.println(Arrays.toString(srr));
		
		int irr[] = {13,9,6,18,23,7,11};
		Arrays.sort(irr);
		System.out.println(Arrays.toString(irr));
		System.out.println("En küçük: " + irr[0]);//indexi 0 olan yani ilk terim
		System.out.println("En büyük: " + irr[irr.length-1]);//indexi enson olan eleman
		
		String srr2 [] = {"ali","veli","deli","seni","beni"};//baþtan ve sondan ikinci elemanýný yazdýralým
		System.out.println(Arrays.toString(srr2));
		System.out.println("Baþtan ikinci : " + srr2[1]);
		System.out.println("Sondan ikinci : " + srr2[3]);
		
		
		
		//bir elemanýn arrayde olup olmadýðýný kontrol edelim.
		int nrr[] = {2,1,7,3,5};
		// nrr array inde 7 var mý kontrol edelim
		
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
/*a-)önce kesinlikle sort() kullanmalýsýnýz
 * b-)aradýðýmýz eleman array de varsa binarySearch() o elemanýn indexini verir.
*/		 
		 
		Arrays.sort(nrr); 
		System.out.println(Arrays.binarySearch(nrr,7));//index 4 olur.önce sort ettik sonra yeni array deki indexi verdi.
//binarySearch() eleman varsa pozitif deðer output eder
//eðer eleman yoksa negatif deðer output eder
		System.out.println(Arrays.binarySearch(nrr,6));//-5
		System.out.println(Arrays.binarySearch(nrr,99));//-6
//note:bir array de tekrarlý elemanlar varsa binary searchmethodu elemanýn var olup olmadýðý hakkýnda doðru karar verebilir
		// ama o elemanýn sýrasý hakkýnda yanýlýr
		
		
		
	
	}

}
