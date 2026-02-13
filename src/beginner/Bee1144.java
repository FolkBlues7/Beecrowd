package beginner;

import java.util.Scanner;

public class Bee1144 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {

			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
			System.out.printf("%d %d %d%n", i, quadrado + 1, cubo + 1);
		}

		scanner.close();

	}

}
