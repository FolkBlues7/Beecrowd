package beginner;

import java.util.Scanner;

public class Bee1064 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cont = 0;
		float total = 0;
		float average = 0;

		float[] numbers = new float[6];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextFloat();
			cont += (numbers[i] > 0) ? 1 : 0; // only the positives
			total += (numbers[i] > 0) ? numbers[i] : 0; // only the positives

		}

		average = total / cont;

		System.out.printf("%d valores positivos%n", cont);
		System.out.printf("%.1f", average);
		scanner.close();

	}

}
