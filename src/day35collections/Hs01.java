package day35collections;

import java.util.HashSet;

public class Hs01 {

	public static void main(String[] args) {
//Hashset rasgele sýralama yapar.
    HashSet<String> hs01 = new HashSet<>();
    hs01.add("apple");
    hs01.add("mango");
    hs01.add("grape");
    hs01.add("fig");
    hs01.add(null);
    System.out.println(hs01);
    hs01.add("apple");//set tekrara izin vermez.error de vermez.üstüne yazar.
    
    hs01.add(null);
    System.out.println(hs01);
    
    System.out.println(hs01.hashCode());
    System.out.println(hs01);

	}

}
