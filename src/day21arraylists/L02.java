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
		System.out.println(sl);//bir elemaný deðiþtirme
		
		//elemanýn varlýðýný kontrol edelim
		System.out.println(sl.contains("Kemal"));//true
		System.out.println(sl.contains("WWWWW"));//false
		
		Collections.sort(sl);//çok kullanýlýr.küçükten büyüðe sýralama veya alfabetik sýralama
		System.out.println(sl);

	}

}
