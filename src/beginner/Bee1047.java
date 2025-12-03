package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1047 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int startHour = scanner.nextInt();
		int startMinute = scanner.nextInt();
		int endHour = scanner.nextInt();
		int endMinute = scanner.nextInt();

		int durationHour = 0;
		int durationMinute = 0;

		if (startHour == endHour) {
			durationHour = 24;
		} else {

			if (startHour > endHour) {
				durationHour = Math.abs(startHour - 24) + endHour;
			} else {
				durationHour = Math.abs(startHour - endHour);
			}
		}

		if (startMinute == endMinute) {
			durationHour = durationHour == 1 ? durationHour - 1 : durationHour;
			durationMinute = (durationHour == 24) ? 0 : 60;
		} else {
			if (startMinute > endMinute) {
				durationMinute = Math.abs(startMinute - 60) + endMinute;
				durationHour -= 1;
			} else {
				durationMinute = Math.abs(startMinute - endMinute);
				durationHour = durationHour == 24 ? 0 : durationHour;
			}
		}

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", durationHour, durationMinute);
		scanner.close();
	}
}
