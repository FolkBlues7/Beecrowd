package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1017 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		final int average = 12;
		int hours = scanner.nextInt();
		int speed = scanner.nextInt();
		int distance = hours * speed;
		double consuptiom = (double) distance / average;

		System.out.printf("%.3f%n", consuptiom);
		scanner.close();

	}

}
