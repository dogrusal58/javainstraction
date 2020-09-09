package day36collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Dq01 {//Deque
	
	/*1-)deque : double ended queue
	 *2-)double ended demek iki uçlu demektir
yani;deque de sona ekle baþtan sil(fifo) ve baþa ekle sondan sil(lifo:last in first out) kurallarýnýn
ikisi de çalýþýr
      3-)deque ler resizable dir
      4-)deque ler linkedlist lerden hýzlýdýr
      5-)deque ler eleman olarak "null" labul etmezler
	 */

	public static void main(String[] args) {
	 Deque<String> dq01 = new LinkedList<>();
	 dq01.add("ali");
	 dq01.addFirst("veli");
	 dq01.addLast("can");
	 dq01.add("ayse");
	 dq01.addFirst("emine");
	 dq01.addLast("reyhan");
     
	 System.out.println(dq01);//[emine, veli, ali, can, ayse, reyhan]
	 System.out.println(dq01.element());
	}

}
