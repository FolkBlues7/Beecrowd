package beginner;

import java.util.Scanner;

public class Bee1051 {
	public static void main(String[] arg) {
		
		Scanner scanner = new Scanner(System.in);
		
		final double TAX1 = 0.08;
		final double TAX2 = 0.18;
		final double TAX3 = 0.28;
		
		double finalTax = 0.0;
		
		double salary = scanner.nextDouble();
		
		if (salary > 4500.00) {
			salary -= 4500; //without the 28% tax
			finalTax = 1000.00 * TAX1 + 1500.00 * TAX2 + salary * TAX3; 
			System.out.printf("R$ %.2f%n", finalTax);
		} else if (salary > 3000.00) {
			salary -= 3000; //without the 18% tax
			finalTax = 1000.00 * TAX1 + salary * TAX2;
			System.out.printf("R$ %.2f%n", finalTax);
		} else if (salary > 2000.00) {
			salary -= 2000; //without the 8% tax
			finalTax = salary * TAX1;
			System.out.printf("R$ %.2f%n", finalTax);
		} else {
			System.out.println("Isento");
		}
		
		scanner.close();
		
	}
}
