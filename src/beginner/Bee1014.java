package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1014 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int distance = scanner.nextInt();
		double total = scanner.nextDouble();
		double average = distance / total;

		System.out.printf("%.3f km/l%n", average);

		scanner.close();

	}

}
