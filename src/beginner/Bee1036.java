package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1036 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double delta = 0;
		double r1 = 0;
		double r2 = 0;

		if (a == 0) {
			System.out.println("Impossivel calcular");
		} else if ((Math.pow(b, 2) - (4 * a * c) < 0)) { // if delta is negative, it's over
			System.out.println("Impossivel calcular");
		} else {
			delta = Math.pow(b, 2) - (4 * a * c);
			r1 = (-b + Math.sqrt(delta)) / (2 * a);
			r2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		scanner.close();

	}

}
