package day06isstatementdt;

import java.util.Scanner;

public class �ifstatement03 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir say� giriniz");
		
		int num = scan.nextInt();
		 if(num<0) { 
			 System.out.println("say� negatif");
		 }
		 
		 if(num>0) {
			 System.out.println("say� pozitif");
		 }
       if(num==0) {
    	   System.out.println("n�tr");

}
	scan.close();
	
	}
}