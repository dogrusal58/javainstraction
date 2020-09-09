package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
		// Array ,i�inde array
		
		int mda[][] = new int [3][2];//3 l� array var i�inde 2 li 3 tane array var
		mda[1][0] = 7;
		System.out.println(Arrays.deepToString(mda));
//normal arrays yazd�r�rken tostring kullan�l�rken
//mda array ler deepToString metodu ile yazd�r�l�r
		
		mda[2][1] = 11;
		System.out.println(Arrays.deepToString(mda));
		mda[0][0] = 5;
		System.out.println(Arrays.deepToString(mda));
		mda[0][1] = 5;
		mda[1][1] = 5;
		mda[2][0] = 5;
		System.out.println(Arrays.deepToString(mda));//mda array in tamam� i�in bunu kullan
		System.out.println(Arrays.toString(mda[0]));//mda array in sadece 1. indexi i�in bunu kullan 
		System.out.println(Arrays.toString(mda[1]));
		System.out.println(Arrays.toString(mda[2]));
		
		//mda n�n k�sa yolu
		char mdac[][] = {{'a','b','c'},{'d'},{'e','f'},{'k','l','m','n'}};
		System.out.println(Arrays.deepToString(mdac));
		
		//soru: yukar�daki mda arraydaki  ilk array in elemanlar�n�n ascii de�rleri toplam�?
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
