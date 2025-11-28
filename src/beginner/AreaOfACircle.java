package beginner;

import java.util.Scanner;

public class AreaOfACircle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double radius = scanner.nextDouble();
		
		System.out.printf("A=%.4f%n", 3.14159 * Math.pow(radius, 2));
		
		scanner.close();

	}

}
