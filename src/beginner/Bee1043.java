package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1043 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();

		boolean isTriangle = (a < b + c) && (b < a + c) && (c < a + b);

		if (isTriangle) {
			System.out.printf("Perimetro = %.1f%n", a + b + c);
		} else {
			float trapeziumArea = ((a + b) * c) / 2;
			System.out.printf("Area = %.1f%n", trapeziumArea);
		}

		scanner.close();

	}

}
