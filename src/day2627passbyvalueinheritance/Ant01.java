package day2627passbyvalueinheritance;

public class Ant01 {

	public static void main(String[] args) {

         String hazine ="Altin";
         hazineCal(hazine);//hazine calmak metodu
         System.out.println(hazine);
         

	}
	public static String hazineCal(String hazine) {
		return hazine + "calindi";
	}

}
