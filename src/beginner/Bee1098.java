package beginner;

public class Bee1098 {

	public static void main(String[] args) {
		for (double i = 0; i <= 20; i += 2) {
			double aux = i / 10;
			for (int j = 1; j <= 3; j++) {
				if (i % 10 == 0) {
					System.out.printf("I=%.0f J=%.0f%n", aux, j + aux);
				} else {
					System.out.printf("I=%.1f J=%.1f%n", aux, j + aux);
				}
			}
		}

	}

}
