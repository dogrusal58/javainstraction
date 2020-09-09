package day35collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q01 {
	//Queue(interface)

	public static void main(String[] args) {
		//ilk eklenen ilk silinir ==> FIFO:first in first out
	//queue ile ilgili soru sorarlarsa fifo yu unutma
		Queue<String> q01 = new LinkedList<>();
		q01.add("apple");
		q01.add("mango");
		q01.add("fig");
		q01.add("peach");
		q01.add("grape");
		System.out.println(q01);//[apple, mango, fig, peach, grape]
		
		q01.remove();//ilk elemaný siler
		System.out.println(q01);
		q01.remove();
		System.out.println(q01);//[fig, peach, grape]
		
		System.out.println(q01.element());//ilk elemaný verir(fig)
		//ilk eleman yoksa "NoSuchElementException" verir.
		System.out.println(q01);//[fig, peach, grape]
		
		System.out.println(q01.poll());//ilk elemaný verir ve siler(fig)
		System.out.println(q01);//[peach, grape]
		
	
		Queue<String> q02 = new PriorityQueue<>();
		q02.add("apple");
		q02.add("mango");
		q02.add("fig");
		q02.add("peach");
		q02.add("grape");
		System.out.println(q02);
	
	
	
	}

}
