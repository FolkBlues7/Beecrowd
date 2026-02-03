package beginner;

import java.util.Scanner;

public class Bee1064 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cont = 0;
		float total = 0;
		float average = 0;

		float numbers = 0;

		for (int i = 0; i < 6; i++) {
			numbers = scanner.nextFloat();

			if (numbers > 0) {
				cont += 1;
				total += numbers;
			}

		}

		average = total / cont;

		System.out.printf("%d valores positivos%n", cont);
		System.out.printf("%.1f%n", average);
		scanner.close();

	}

}
