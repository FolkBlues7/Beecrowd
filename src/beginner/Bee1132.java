package beginner;

import java.util.Scanner;

public class Bee1132 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		int aux = a;

		while (true) {
			if (aux % 13 == 0) {
				break;
			} else {
				aux++;
			}
		}

		int sumDivisibleBy13 = 0;
		for (int i = aux; i <= b; i += 13) {
			sumDivisibleBy13 += i;
		}

		int totalSum = ((a + b) * (b - a + 1)) / 2;

		System.out.println(totalSum - sumDivisibleBy13);

		scanner.close();

	}

}
