package beginner;

import java.util.Scanner;

public class Bee1066 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numbers = 0;

		int odd = 0;
		int even = 0;
		int negative = 0;
		int positive = 0;

		for (int i = 0; i < 5; i++) {
			numbers = scanner.nextInt();

			// odd or even
			if (numbers % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}

			// positive or negative
			if (numbers > 0) {
				positive += 1;
			} else if (numbers < 0) {
				negative += 1;
			}

		}

		System.out.printf("%d valor(es) par(es)%n", even);
		System.out.printf("%d valor(es) impar(es)%n", odd);
		System.out.printf("%d valor(es) positivo(s)%n", positive);
		System.out.printf("%d valor(es) negativo(s)%n", negative);

		scanner.close();

	}

}
