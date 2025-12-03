package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1048 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		float salary = scanner.nextFloat();

		float newSalary = 0;
		float moneyEarned = 0;
		int porcentage = 0;

		if (salary > 0 && salary <= 400) {
			moneyEarned = (float) (salary * 0.15);
			newSalary = (float) (salary * 1.15);
			porcentage = 15;
		} else if (salary > 400 && salary <= 800) {
			moneyEarned = (float) (salary * 0.12);
			newSalary = (float) (salary * 1.12);
			porcentage = 12;
		} else if (salary > 800 && salary <= 1200) {
			moneyEarned = (float) (salary * 0.10);
			newSalary = (float) (salary * 1.10);
			porcentage = 10;
		} else if (salary > 1200 && salary <= 2000) {
			moneyEarned = (float) (salary * 0.07);
			newSalary = (float) (salary * 1.07);
			porcentage = 7;
		} else if (salary > 2000) {
			moneyEarned = (float) (salary * 0.04);
			newSalary = (float) (salary * 1.04);
			porcentage = 4;
		}

		System.out.printf("Novo salario: %.2f%n", newSalary);
		System.out.printf("Reajuste ganho: %.2f%n", moneyEarned);
		System.out.printf("Em percentual: %d %%%n", porcentage);

		scanner.close();

	}

}
