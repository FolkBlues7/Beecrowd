package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1020 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int dias = scanner.nextInt();

		int anos = dias / 365;
		dias %= 365;

		int meses = dias / 30;
		dias %= 30;

		System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", anos, meses, dias);

		scanner.close();

	}

}
