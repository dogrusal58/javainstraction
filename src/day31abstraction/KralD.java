package day31abstraction;

public class KralD extends Otel {

	public static void main(String[] args) {
		
		KralD krl = new KralD();
		krl.cay();
		krl.kahvalti();
		krl.wifi();

	}

	@Override
	public void kahvalti() {
		System.out.println("Insan gibi ye...");	
	}

	@Override
	public void cay() {
		System.out.println("Cay ic iyidir...");
	}
}