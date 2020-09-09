package day35collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class Ts01 {//tree set
	
	public static void main(String[] args) {
		//elemanlar naturel order a göre dizilirler.bu iþlem zaman alýr,
		//bu yüzden tree set hashset ten yavaþtýr
		
		//***sýralý ve tekrarsýz elemanlarý sýralamk için hangi yöntemi kullanýrsýnýz?
		  /* klasik cevap:treeset kullanýrým ama böyle derseniz booooom
		   doðru cevap: hashset kullanarak objeyi oluþtururum.elemanlarý hashsete eklerim.
		   bu elemanlarý sýralamak için de oluþturduðum hashset objesini treesete çeviririm.*/
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		//iki set arasýndaki hýz farkýný görmek için anlýk zamaný ekledik
		
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
		
		TreeSet<String> ts02 = new TreeSet<>(hs02);//hashset i treeset e çevirdik.
		System.out.println(ts02);
		
		LocalTime time4 = LocalTime.now();
		System.out.println(time4);
		
	}

}
