package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
		// Array ,içinde array
		
		int mda[][] = new int [3][2];//3 lü array var içinde 2 li 3 tane array var
		mda[1][0] = 7;
		System.out.println(Arrays.deepToString(mda));
//normal arrays yazdýrýrken tostring kullanýlýrken
//mda array ler deepToString metodu ile yazdýrýlýr
		
		mda[2][1] = 11;
		System.out.println(Arrays.deepToString(mda));
		mda[0][0] = 5;
		System.out.println(Arrays.deepToString(mda));
		mda[0][1] = 5;
		mda[1][1] = 5;
		mda[2][0] = 5;
		System.out.println(Arrays.deepToString(mda));//mda array in tamamý için bunu kullan
		System.out.println(Arrays.toString(mda[0]));//mda array in sadece 1. indexi için bunu kullan 
		System.out.println(Arrays.toString(mda[1]));
		System.out.println(Arrays.toString(mda[2]));
		
		//mda nýn kýsa yolu
		char mdac[][] = {{'a','b','c'},{'d'},{'e','f'},{'k','l','m','n'}};
		System.out.println(Arrays.deepToString(mdac));
		
		//soru: yukarýdaki mda arraydaki  ilk array in elemanlarýnýn ascii deðrleri toplamý?
		//1.yol :
		System.out.println(mdac[0][0]+mdac[0][1]+mdac[0][2]);//294
		//2. yol :
		int sum = 0;
		for (int i =0 ; i<mdac[0].length;i++) {
			sum =sum +mdac[0][i];
			
		}
		System.out.println(sum);
		
	
	}

}
