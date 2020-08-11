package day06isstatementdt;

import java.util.Scanner;

public class Ýifstatement03 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayý giriniz");
		
		int num = scan.nextInt();
		 if(num<0) { 
			 System.out.println("sayý negatif");
		 }
		 
		 if(num>0) {
			 System.out.println("sayý pozitif");
		 }
       if(num==0) {
    	   System.out.println("nötr");

}
	scan.close();
	
	}
}