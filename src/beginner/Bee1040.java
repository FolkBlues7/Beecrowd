package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1040 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		float n1 = scanner.nextFloat();
		float n2 = scanner.nextFloat();
		float n3 = scanner.nextFloat();
		float n4 = scanner.nextFloat();

		float weightedAverage = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;

		System.out.printf("Media: %.1f%n", weightedAverage);
		if (weightedAverage >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (weightedAverage < 5.0) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");

			float examScore = scanner.nextFloat();

			System.out.printf("Nota do exame: %.1f%n", examScore);

			float finalAverage = (weightedAverage + examScore) / 2;

			if (finalAverage >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}

			System.out.printf("Media final: %.1f%n", finalAverage);
		}

		scanner.close();

	}
}
