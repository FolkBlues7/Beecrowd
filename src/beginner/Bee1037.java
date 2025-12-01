package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1037 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		double number = scanner.nextDouble();

		if (number < 0 || number > 100) {
			System.out.println("Fora de intervalo");
		} else if (number >= 0 && number <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (number > 25 && number <= 50) {
			System.out.println("Intervalo (25,50]");
		} else {
			System.out.println("Intervalo (75,100]");
		}

		scanner.close();

	}

}
