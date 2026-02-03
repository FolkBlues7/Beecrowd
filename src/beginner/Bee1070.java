package beginner;

import java.util.Scanner;

public class Bee1070 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		if (number % 2 == 0) {
			number += 1;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println(number);
			number += 2;
		}

		scanner.close();

	}

}
