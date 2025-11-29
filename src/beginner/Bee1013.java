package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1013 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int greatestAB = (a + b + Math.abs(a - b)) / 2; // Same as Math.max(a, b)
		int greatestOfAll = (c + greatestAB + Math.abs(c - greatestAB)) / 2; // Same as Math.max(c, greatestAB)

		System.out.printf("%d eh o maior%n", greatestOfAll);

		scanner.close();
	}

}
