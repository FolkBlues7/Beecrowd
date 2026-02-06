package beginner;

import java.util.Scanner;

public class Bee1072 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int n = scanner.nextInt();
		int input = 0;
		int contIn = 0;
		int contOut = 0;

		for (int i = 0; i < n; i++) {
			input = scanner.nextInt();
			if (input >= 0 && input <= 20) {
				contIn++;
			} else {
				contOut++;
			}
		}

		System.out.printf("%d in%n%d out%n", contIn, contOut);

		scanner.close();

	}

}
