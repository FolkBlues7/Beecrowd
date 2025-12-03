package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1048 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		float salary = scanner.nextFloat();

		int porcentage = 0;

		if (salary >= 0 && salary <= 400) {
			porcentage = 15;
		} else if (salary <= 800) {
			porcentage = 12;
		} else if (salary <= 1200) {
			porcentage = 10;
		} else if (salary <= 2000) {
			porcentage = 7;
		} else {
			porcentage = 4;
		}

		double moneyEarned = salary * (porcentage / 100.0);
		double newSalary = salary + moneyEarned;

		System.out.printf("Novo salario: %.2f%n", newSalary);
		System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
		System.out.printf("Em percentual: %d %%%n", porcentage);

		scanner.close();

	}

}
