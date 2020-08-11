package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		List<String> sl =new ArrayList<>();
		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayse");
		
		
		sl.set(0,"Aliye");
		System.out.println(sl);//bir eleman� de�i�tirme
		
		//eleman�n varl���n� kontrol edelim
		System.out.println(sl.contains("Kemal"));//true
		System.out.println(sl.contains("WWWWW"));//false
		
		Collections.sort(sl);//�ok kullan�l�r.k���kten b�y��e s�ralama veya alfabetik s�ralama
		System.out.println(sl);

	}

}
