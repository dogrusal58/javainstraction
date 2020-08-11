package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
		String s[] = {"A","B","C"};
		List <String> sl = new ArrayList<>();
		//Bir Array i nasýl liste çeviririm?
		sl = Arrays.asList(s);
		System.out.println(sl);//A,B,C
		//Bir list nasýl Array e çevirilir?
		/*
		 * javada her classýn en az 1 tane parenti vardýr.
		 * parenti olmayan tek class vardýr Object Class týr
		 * Object Class tüm class larýn ortak babasýdýr.
		 */
		Object[] listtenArray = sl.toArray();

	}

}
