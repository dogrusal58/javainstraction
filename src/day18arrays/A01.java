package day18arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		int arr1[] = new int [3];//Array in lenghti ikinci k��eli parantezin i�ine yaz�l�r(3 elemanl�)
		//Array object tir.unutma.
		System.out.println(Arrays.toString(arr1));
		//bir array i consola yazzd�rmak i�in Arrays.toString() kullan�r�z.
		
		//�imdi de Array e eleman ekleyece�iz.
		//Arraylar Stringler gibi index kullan�r.
		arr1 [2] = 11;// indexi 2 olan eleman 11 yazar.(0,0,11)
		arr1[1] = 9 ;// orta eleman� 9 yapar.(0,9,11)
		arr1[0] = 7 ;// ilk eleman� 7 yapar.(7,9,11)
		System.out.println(Arrays.toString(arr1));
		
		//arr1[3] = 13;
		//System.out.println(Arrays.toString(arr1));//�al���r hata verir.��nki bizim array 3 haneli olacak.
//bu hata run time error
		
		int arr2[] = {8,10,12,14};
		System.out.println(Arrays.toString(arr2));
	}
}
