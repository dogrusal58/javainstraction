package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
		String s[] = {"A","B","C"};
		List <String> sl = new ArrayList<>();
		//Bir Array i nas�l liste �eviririm?
		sl = Arrays.asList(s);
		System.out.println(sl);//A,B,C
		//Bir list nas�l Array e �evirilir?
		/*
		 * javada her class�n en az 1 tane parenti vard�r.
		 * parenti olmayan tek class vard�r Object Class t�r
		 * Object Class t�m class lar�n ortak babas�d�r.
		 */
		Object[] listtenArray = sl.toArray();

	}

}
