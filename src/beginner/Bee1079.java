package beginner;

import java.util.Scanner;

public class Bee1079 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final short WEIGHT1 = 2;
		final short WEIGHT2 = 3;
		final short WEIGHT3 = 5;

		final int set = scanner.nextInt();

		double value1 = 0;
		double value2 = 0;
		double value3 = 0;

		double weightedAverage = 0;

		for (int i = 0; i < set; i++) {
			value1 = scanner.nextDouble();
			value2 = scanner.nextDouble();
			value3 = scanner.nextDouble();

			weightedAverage = (value1 * WEIGHT1 + value2 * WEIGHT2 + value3 * WEIGHT3) / (WEIGHT1 + WEIGHT2 + WEIGHT3);

			System.out.printf("%.1f%n", weightedAverage);
		}

		scanner.close();

	}

}
