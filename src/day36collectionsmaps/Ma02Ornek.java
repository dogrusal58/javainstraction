package day36collectionsmaps;

import java.util.Arrays;

public class Ma02Ornek {

	public static void main(String[] args) {
	/*
	Size verilen bir yaz�da hangi kelimenin ka�defa kullan�ld���n� g�steren kodu yazal�m
	 */
		
		String s ="java ogrenmek zevkliydi. java ogrenmek kolay ama tekrar gerekiyor. java tekrari zevkliydi ama vaktim yoktu.";
        String kelime[] =s.split(" ");
        System.out.println(Arrays.toString(kelime));
	}

}
