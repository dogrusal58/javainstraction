package day10;

import java.util.Scanner;

public class StringMethod02 {

	public static void main(String[] args) {
		String a = "Java";
		String b = "Java";
		Scanner scan = new Scanner(System.in);
		System.out.println("Java gir");
		String c =scan.next();
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==c);
		System.out.println(a.equals(c));
		scan.close();
		
		String d = "suleyman";
		String e = "SULEYMAN";
		String f = "Suleyman";
		System.out.println(d.equalsIgnoreCase(e));
		System.out.println(e.equalsIgnoreCase(f));

	}

}
