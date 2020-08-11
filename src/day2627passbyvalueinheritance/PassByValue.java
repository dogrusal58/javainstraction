package day2627passbyvalueinheritance;

public class PassByValue {
	//java passbyvalue kullan�r,passbayreference kullanmaz.
	//ana de�erin kopyas� �zerinde �al���r.

	public static void main(String[] args) {

       int gomlek =100;
       indOgr(gomlek);//buradan metodu �a��rd�k
       askInd(gomlek);
       indYasli(gomlek);
       
       System.out.println(gomlek);//100
       System.out.println(indOgr(gomlek));//80
       System.out.println(askInd(gomlek));//95
       System.out.println(indYasli(gomlek));//90
	}
	public static int indOgr(int gomlek) {//metod olu�turduk
		return gomlek-20;
	}
	public static int askInd(int gomlek) {
		return gomlek-5;
	}
	public static int indYasli(int gomlek) {
		return gomlek-10;
	}

}
