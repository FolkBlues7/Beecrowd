package beginner;

import java.util.Scanner;

public class Bee1060 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double[] v = new double[6];

		for (int i = 0; i < v.length; i++) {
			v[i] = scanner.nextDouble();
		}

		// Arrays.sort(v); // optional

		int positive = 0;

		for (double i : v) {
			if (i > 0) {
				positive++;
			}
		}

		System.out.printf("%d valores positivos%n", positive);

		scanner.close();
	}

}
