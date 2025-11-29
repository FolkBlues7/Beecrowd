package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1019 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int time[] = { 3600, 60, 1 }; // hour, minute and second

		int minutes = scanner.nextInt();

		scanner.close();

		String result = "";

		for (int i = 0; i < time.length; i++) {
			result += minutes / time[i];
			result += i == 2 ? "" : ":";

			minutes %= time[i];
		}

		System.out.println(result);

	}

}
