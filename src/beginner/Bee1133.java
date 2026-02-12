package beginner;

import java.util.Scanner;

public class Bee1133 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();

		if (y > x) {
			int temp = y;
			y = x;
			x = temp;
		}

		for (int i = y + 1; i < x; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}

		scanner.close();

	}

}
