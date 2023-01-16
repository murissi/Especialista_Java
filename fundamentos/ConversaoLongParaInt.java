public class ConversaoLongParaInt {
	
	public static void main(String[] args) {

		long x = 10;
		int y = (int) x; // Cast

		System.out.printf("y: %d\n", y);
		System.out.printf("x: %d\n", x);

		long a = 93000000035L;
		int b = (int) a;

		System.out.println("a: " + a);
		System.out.println("b: " + b);



	}

}