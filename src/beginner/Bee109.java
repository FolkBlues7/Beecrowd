package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee109 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next(); // Never used, but required by the prompt
		double salary = scanner.nextDouble();
		double totalSales = scanner.nextDouble();

		System.out.printf("TOTAL = R$ %.2f%n", salary + (totalSales *= 0.15)); // *0.15 gets 15% of salary and store the
																				// result in
																				// totalSales

		scanner.close();
	}

}
