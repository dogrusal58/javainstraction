package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {
		// aný veren yazým
		LocalTime lt =LocalTime.now();
		System.out.println(lt);//22:22:00.753
		//zamanda ileri gitme
		System.out.println(lt.plusHours(3));
		System.out.println(lt.plusMinutes(56));
		System.out.println(lt.plusSeconds(75));
		
		//zamanda geri
		System.out.println(lt.minusHours(2));
		System.out.println(lt.minusMinutes(20));
		System.out.println(lt.minusSeconds(45));
		
		//formatý deðiþtirme
		DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("hh:mm");//10:31
		System.out.println(dtf1.format(lt));
		DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("HH:mm");//22:31
		System.out.println(dtf2.format(lt));
		
		//farklý ülkelerdeki yerel saat
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));
	}

}
