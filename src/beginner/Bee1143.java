package beginner;

import java.util.Scanner;

public class Bee1143 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d%n", i, i * i, i * i * i);

		}
		System.out.println();

		scanner.close();

	}

}
