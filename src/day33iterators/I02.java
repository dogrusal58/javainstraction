package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("x");
		list1.add("y");
		list1.add("z");
		System.out.println(list1);//[x,y,z]
		
		ListIterator<String> li1 =list1.listIterator();
		//while loop un içinde next metodunu kullanmazsak pointer hareket etmez ve sonsuz döngü oluþur
		
		while(li1.hasNext()) {
			Object el =li1.next();
			li1.remove();
			if(el.equals("Y")) {
				break;
			}

			}
		System.out.println(list1);
		
	}

}
