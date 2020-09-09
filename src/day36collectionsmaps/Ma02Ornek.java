package day36collectionsmaps;

import java.util.Arrays;

public class Ma02Ornek {

	public static void main(String[] args) {
	/*
	Size verilen bir yazýda hangi kelimenin kaçdefa kullanýldýðýný gösteren kodu yazalým
	 */
		
		String s ="java ogrenmek zevkliydi. java ogrenmek kolay ama tekrar gerekiyor. java tekrari zevkliydi ama vaktim yoktu.";
        String kelime[] =s.split(" ");
        System.out.println(Arrays.toString(kelime));
	}

}
