package day19arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
		// bir stringi par�alara ay�rmak
		
		String str = "Ipek topu at,topu at Ipek.";
		String strArray[] = str.split(",");
		System.out.println(Arrays.toString(strArray));
		
		//str stringinde ka� kelime var?
		
		String sArray[] =str.split(" ");
		System.out.println(Arrays.toString(sArray));
		System.out.println(sArray.length);
		
		String tArray[] =str.split("");
		System.out.println(Arrays.toString(tArray));//harf harf yazd�r�r

	}

}
