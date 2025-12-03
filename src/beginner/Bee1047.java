package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1047 {
//The trick here is to use minutes instead of hours and minutes
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int startHour = scanner.nextInt();
		int startMinute = scanner.nextInt();
		int endHour = scanner.nextInt();
		int endMinute = scanner.nextInt();

		int totalStart = startHour * 60 + startMinute;
		int totalEnd = endHour * 60 + endMinute;

		int durationInMinutes = totalEnd - totalStart;

		if (durationInMinutes <= 0) {
			durationInMinutes += 24 * 60;
		}

		int finalHours = durationInMinutes / 60;
		int finalMinutes = durationInMinutes % 60;

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", finalHours, finalMinutes);
		scanner.close();
	}
}
