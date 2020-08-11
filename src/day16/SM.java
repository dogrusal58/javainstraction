package day16;

public class SM {//Static Member
	static int x;
	int y;
	SM(){
		x+=2;
		y++;
		
	}
	static int getSquare() {
		return x*x;
	}


	public static void main(String[] args) {
		SM sm1 = new SM();
		SM sm2 = new SM();
		int z =sm1.getSquare();
		System.out.println("-x" + z + "-y" + sm2.y);
		}

}
