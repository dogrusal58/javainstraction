package day16;

public class Counter {
	int count = 0;
	Counter(){ this.count++;
	System.out.println(count);
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

	}

}
