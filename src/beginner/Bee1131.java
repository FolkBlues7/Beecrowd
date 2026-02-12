package beginner;

import java.util.Scanner;

public class Bee1131 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int gremio = 0;
		int inter = 0;
		int total = 0;
		int tie = 0;

		while (true) {

			int interScore = scanner.nextInt();
			int gremioScore = scanner.nextInt();

			if (interScore == gremioScore) {
				tie++;
			} else if (interScore > gremioScore) {
				inter++;
			} else {
				gremio++;
			}

			int n = 0;

			while (n != 1 && n != 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				n = scanner.nextInt();
			}

			if (n == 2) {
				break;
			}
		}

		total = inter + gremio + tie;

		System.out.printf("%d grenais%n", total);
		System.out.printf("Inter:%d%n", inter);
		System.out.printf("Gremio:%d%n", gremio);
		System.out.printf("Empates:%d%n", tie);

		if (inter == gremio) {
			System.out.println("Não houve vencedor");
		} else if (inter > gremio) {
			System.out.println("Inter venceu mais");
		} else {
			System.out.println("Gremio venceu mais");
		}

		scanner.close();

	}

}
