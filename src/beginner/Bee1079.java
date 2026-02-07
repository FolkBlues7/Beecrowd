package beginner;

import java.util.Scanner;

public class Bee1079 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final short WEIGHT1 = 2;
		final short WEIGHT2 = 3;
		final short WEIGHT3 = 5;

		final int TOTAL_WEIGHT = WEIGHT1 + WEIGHT2 + WEIGHT3;

		final int set = scanner.nextInt();

		double weightedAverage = 0;

		for (int i = 0; i < set; i++) {
			double value1 = scanner.nextDouble();
			double value2 = scanner.nextDouble();
			double value3 = scanner.nextDouble();

			weightedAverage = (value1 * WEIGHT1 + value2 * WEIGHT2 + value3 * WEIGHT3) / TOTAL_WEIGHT;

			System.out.printf("%.1f%n", weightedAverage);
		}

		scanner.close();

	}

}
