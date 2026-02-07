package beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bee1080 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers = new ArrayList<Integer>();
		int biggest = 0;
		int index = 0;

		for (int i = 0; i < 100; i++) {
			numbers.add(scanner.nextInt());
		}

		biggest = Collections.max(numbers);
		index = numbers.indexOf(biggest) + 1;
		// We are adding + 1 because the output presentation expect by Beecrowd

		System.out.printf("%d%n%d%n", biggest, index);

		scanner.close();

	}

}
