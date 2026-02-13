package beginner;

import java.util.Scanner;

public class Bee1142 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int count = n * 4 - 1;

		for (int i = 1; i < count; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d ", i++);
			}
			System.out.println("PUM");
		}

		scanner.close();

	}

}
