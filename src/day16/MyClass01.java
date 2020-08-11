package day16;

public class MyClass01 
{
	int x;
	static int y;//static olduðunu unutma.
	MyClass01(int i){
		x+=i;
		y+=i;
		
	}
	
	public static void main(String[] args) {
		new MyClass01(2);
		MyClass01 mc = new MyClass01(3);
		System.out.println(mc.x + "," + mc.y);
		

	}

}
