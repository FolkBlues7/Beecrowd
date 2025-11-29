package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1018 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int bankNotes[] = { 100, 50, 20, 10, 5, 2, 1 };

		int money = scanner.nextInt();
		System.out.println(money);
		for (int i = 0; i < bankNotes.length; i++) {
			System.out.printf("%d nota(s) de R$ %d,00%n", money / bankNotes[i], bankNotes[i]);
			money %= bankNotes[i];
		}

		scanner.close();

	}

}
