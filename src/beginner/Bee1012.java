package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1012 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();

		double triangleArea = (A * C) / 2;
		double circleArea = 3.14159 * Math.pow(C, 2);
		double trapeziumArea = ((A + B) * C) / 2;
		double squareArea = Math.pow(B, 2);
		double reactangleArea = A * B;

		System.out.printf("TRIANGULO: %.3f%n", triangleArea);
		System.out.printf("CIRCULO: %.3f%n", circleArea);
		System.out.printf("TRAPEZIO: %.3f%n", trapeziumArea);
		System.out.printf("QUADRADO: %.3f%n", squareArea);
		System.out.printf("RETANGULO: %.3f%n", reactangleArea);

		scanner.close();

	}

}
