package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("x");
		list1.add("y");
		list1.add("z");
		System.out.println(list1);//[x,y,z]
		//loop kullanarak listleri deðiþtiremezsiniz.elemanlarý deðiþtirebilirsiniz ama listi uptade edemezsiniz.
		for(String w : list1) {
			w =w +"a";
		}
		System.out.println(list1);//[x, y, z]
		//bir listi uptade etmek isterseniz iterator kullanmak zorundasýnýz
		//1. adým : ListIterator objesini oluþturun
		ListIterator<String> li1 =list1.listIterator();
		// 2. adým while loop kullanýn
		while(li1.hasNext()) {
			Object element =li1.next();
			li1.set(element + "a");
		}
System.out.println(list1);//[xa, ya, za]
/*hasNext()
 * 
 */

/*bir list oluþturun.her elemanýn baþýna "K" ve sonuna "L" ekleyin
 * 
 */
      List<String> list2 = new ArrayList<>()  ;
      list2.add("W");
      list2.add("X");
      list2.add("Z");
      
      ListIterator<String> li2 =list2.listIterator();
      
      while(li2.hasNext()) {
    	  Object el =li2.next();
    	  li2.set("K" + el + "L");
   }
      System.out.println(list2);







	}

}
