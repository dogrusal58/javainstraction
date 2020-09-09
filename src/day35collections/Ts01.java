package day35collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class Ts01 {//tree set
	
	public static void main(String[] args) {
		//elemanlar naturel order a g�re dizilirler.bu i�lem zaman al�r,
		//bu y�zden tree set hashset ten yava�t�r
		
		//***s�ral� ve tekrars�z elemanlar� s�ralamk i�in hangi y�ntemi kullan�rs�n�z?
		  /* klasik cevap:treeset kullan�r�m ama b�yle derseniz booooom
		   do�ru cevap: hashset kullanarak objeyi olu�tururum.elemanlar� hashsete eklerim.
		   bu elemanlar� s�ralamak i�in de olu�turdu�um hashset objesini treesete �eviririm.*/
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		//iki set aras�ndaki h�z fark�n� g�rmek i�in anl�k zaman� ekledik
		
		TreeSet<String> ts01 = new TreeSet<>();
		ts01.add("apple");
		ts01.add("mango");
		ts01.add("grape");
		ts01.add("fig");
		ts01.add("orange");
		ts01.add("peach");
		System.out.println(ts01);//[apple, fig, grape, mango, orange, peach]
		
		LocalTime time2 = LocalTime.now();
		System.out.println(time2);
		
		HashSet<String> hs01 = new HashSet<>();
		hs01.add("apple");
		hs01.add("mango");
		hs01.add("grape");
		hs01.add("fig");
		hs01.add("orange");
		hs01.add("peach");
		System.out.println(hs01);
		
		LocalTime time3 = LocalTime.now();
		System.out.println(time3);
		
		
		HashSet<String> hs02 = new HashSet<>();
		hs02.add("apple");
		hs02.add("mango");
		hs02.add("grape");
		hs02.add("fig");
		hs02.add("orange");
		hs02.add("peach");
		System.out.println(hs02);
		
		TreeSet<String> ts02 = new TreeSet<>(hs02);//hashset i treeset e �evirdik.
		System.out.println(ts02);
		
		LocalTime time4 = LocalTime.now();
		System.out.println(time4);
		
	}

}
