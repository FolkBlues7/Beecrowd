package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1042 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();

		int nums[] = { n1, n2, n3 };
		// originals[] = nums[] would just copy the reference to nums's array in heap
		int originals[] = { n1, n2, n3 };

		// This is a simple sorting algorithm that works for inputs
		// of any size! Besides, there're other classes
		// who could handle this problem in a few lines of code,
		// but the question probably intend to test
		// yours logics with sorting algorithm.
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int bigger = nums[i];
					nums[i] = nums[j];
					nums[j] = bigger;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		System.out.println();

		for (int i = 0; i < originals.length; i++) {
			System.out.println(originals[i]);
		}

		scanner.close();

	}

}
