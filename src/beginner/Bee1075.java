package beginner;

import java.util.Scanner;

public class Bee1075 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int n = scanner.nextInt();

		for (int i = 2; i <= 10000; i += n) {
			System.out.println(i);
		}

		scanner.close();

	}

}
