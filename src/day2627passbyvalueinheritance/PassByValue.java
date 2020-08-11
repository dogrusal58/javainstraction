package day2627passbyvalueinheritance;

public class PassByValue {
	//java passbyvalue kullanýr,passbayreference kullanmaz.
	//ana deðerin kopyasý üzerinde çalýþýr.

	public static void main(String[] args) {

       int gomlek =100;
       indOgr(gomlek);//buradan metodu çaðýrdýk
       askInd(gomlek);
       indYasli(gomlek);
       
       System.out.println(gomlek);//100
       System.out.println(indOgr(gomlek));//80
       System.out.println(askInd(gomlek));//95
       System.out.println(indYasli(gomlek));//90
	}
	public static int indOgr(int gomlek) {//metod oluþturduk
		return gomlek-20;
	}
	public static int askInd(int gomlek) {
		return gomlek-5;
	}
	public static int indYasli(int gomlek) {
		return gomlek-10;
	}

}
