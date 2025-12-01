package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1038 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();
		int quantity = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.printf("Total: R$ %.2f%n", quantity * 4.0);
			break;
		case 2:
			System.out.printf("Total: R$ %.2f%n", quantity * 4.50);
			break;
		case 3:
			System.out.printf("Total: R$ %.2f%n", quantity * 5.0);
			break;
		case 4:
			System.out.printf("Total: R$ %.2f%n", quantity * 2.0);
			break;
		case 5:
			System.out.printf("Total: R$ %.2f%n", quantity * 1.50);
			break;
		}

		scanner.close();

	}

}
