package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {
	/*
1-)anlýk tarihi yazacaðýz
2-)tarihi ilerletmek ve geriletmek
3-)tarihi farklý formatlarda yazmak
		 */
	public static void main(String[] args) {
		//Anlýk tarih nasýl alýnýr?
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);//2020-07-21
		
		//ileri tarihi yazdýrma.
		ld.plusDays(275);
		System.out.println(ld.plusDays(275));//2021-04-22
		System.out.println(ld.plusMonths(3));//2020-10-21
		System.out.println(ld.plusYears(4));//2024-07-21
		System.out.println(ld.plusWeeks(7));//2020-09-08
		
		//geçmiþ tarihe gitme
		System.out.println(ld.minusDays(45));
		System.out.println(ld.minusMonths(6));
		System.out.println(ld.minusWeeks(9));
		System.out.println(ld.minusYears(5));
		
		//tarih formatýný deðiþtirme
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf.format(ld));//21/07/2020
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(dtf1.format(ld));//21/Tem/2020
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(dtf2.format(ld));//21/Temmuz/2020
		
		
		
		
		
		
		
		

	}

}
