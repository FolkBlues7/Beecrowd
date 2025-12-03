package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1046 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int start = scanner.nextInt();
		int end = scanner.nextInt();

		int duration = 0;

		if (start == end) {
			duration = 24;
			System.out.printf("O JOGO DUROU %d HORA(S)%n", duration);
		} else if (start > end) {
			duration = -1 * (start - 24) + end; // -1 so duration won't be negative Math.abs() would do the trick as
												// well
			System.out.printf("O JOGO DUROU %d HORA(S)%n", duration);
		} else {
			duration = -1 * (start - end); // -1 so duration won't be negative Math.abs() would do the trick as
											// well
			System.out.printf("O JOGO DUROU %d HORA(S)%n", duration);
		}

		scanner.close();

	}

}
