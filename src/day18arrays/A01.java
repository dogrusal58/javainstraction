package day18arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		int arr1[] = new int [3];//Array in lenghti ikinci köþeli parantezin içine yazýlýr(3 elemanlý)
		//Array object tir.unutma.
		System.out.println(Arrays.toString(arr1));
		//bir array i consola yazzdýrmak için Arrays.toString() kullanýrýz.
		
		//þimdi de Array e eleman ekleyeceðiz.
		//Arraylar Stringler gibi index kullanýr.
		arr1 [2] = 11;// indexi 2 olan eleman 11 yazar.(0,0,11)
		arr1[1] = 9 ;// orta elemaný 9 yapar.(0,9,11)
		arr1[0] = 7 ;// ilk elemaný 7 yapar.(7,9,11)
		System.out.println(Arrays.toString(arr1));
		
		//arr1[3] = 13;
		//System.out.println(Arrays.toString(arr1));//çalýþýr hata verir.çünki bizim array 3 haneli olacak.
//bu hata run time error
		
		int arr2[] = {8,10,12,14};
		System.out.println(Arrays.toString(arr2));
	}
}
