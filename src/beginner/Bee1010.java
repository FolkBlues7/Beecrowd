package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1010 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int number1 = scanner.nextInt(); // never used, but required by the prompt
		int quantity1 = scanner.nextInt();
		double price1 = scanner.nextDouble();

		int number2 = scanner.nextInt(); // never used, but required by the prompt
		int quantity2 = scanner.nextInt();
		double price2 = scanner.nextDouble();

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", quantity1 * price1 + quantity2 * price2);

		scanner.close();

	}

}
