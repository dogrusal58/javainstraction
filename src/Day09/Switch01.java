package Day09;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf giriniz : ");
		char harf =scan.next().charAt(0);
		if(harf=='a'||harf=='A') {System.out.println("ilk harf");
		
		}else if(harf=='b'||harf=='B') {System.out.println("ikinci harf");
		
		}else if(harf=='c'||harf=='C') {System.out.println("üçüncü harf");
		
		}else {System.out.println("tanýmlanamadý");
		
		}
       scan.close();
	}

}
//1.yol if-else-if ile çözdük
//2.yol switch-case olacak
