package beginner;

public class Bee1095 {

	public static void main(String[] args) {

		int a = 1;
		int b = 60;
		// I=1 J=60
		for (int i = 0; i < 13; i++) {
			System.out.printf("I=%d J=%d%n", a, b);
			a += 3;
			b -= 5;

		}
	}

}
