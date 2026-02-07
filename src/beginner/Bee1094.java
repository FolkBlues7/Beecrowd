package beginner;

import java.util.Scanner;

public class Bee1094 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sapo = 0;
		int coelho = 0;
		int rato = 0;
		int total = 0;

		final int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int quantity = scanner.nextInt();
			char animal = scanner.next().charAt(0);

			switch (animal) {
			case 'S':
				sapo += quantity;
				break;
			case 'C':
				coelho += quantity;
				break;
			case 'R':
				rato += quantity;
				break;
			}
		}

		total = sapo + coelho + rato;

		double sapoPorcentage = (total > 0) ? sapo * 100.00 / total : 0;
		double coelhoPorcentage = (total > 0) ? coelho * 100.00 / total : 0;
		double ratoPorcentage = (total > 0) ? rato * 100.00 / total : 0;

		System.out.printf("Total: %d cobaias%n", total);
		System.out.printf("Total de coelhos: %d%n", coelho);
		System.out.printf("Total de ratos: %d%n", rato);
		System.out.printf("Total de sapos: %d%n", sapo);
		System.out.printf("Percentual de coelhos: %.2f %%%n", coelhoPorcentage);
		System.out.printf("Percentual de ratos: %.2f %%%n", ratoPorcentage);
		System.out.printf("Percentual de sapos: %.2f %%%n", sapoPorcentage);

		scanner.close();

	}

}
