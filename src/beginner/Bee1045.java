package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1045 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		double sides[] = { a, b, c };

		// simple sort:
		for (int i = 0; i < sides.length - 1; i++) {
			for (int j = 1; j < sides.length; j++) {
				if (sides[j] > sides[i]) {
					double aux = sides[j];
					sides[j] = sides[i];
					sides[i] = aux;
				}
			}
		}
		// two sides are the same and the third one
		// TRIANGULO ISOSCELES
		if (sides[0] >= sides[1] + sides[2]) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {

			if (Math.pow(sides[0], 2) == Math.pow(sides[1], 2) + Math.pow(sides[2], 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(sides[0], 2) > Math.pow(sides[1], 2) + Math.pow(sides[2], 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(sides[0], 2) < Math.pow(sides[1], 2) + Math.pow(sides[2], 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (sides[0] == sides[1] && sides[0] == sides[2]) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (sides[0] == sides[1] || sides[0] == sides[2] || sides[1] == sides[2]) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		scanner.close();
	}

}
