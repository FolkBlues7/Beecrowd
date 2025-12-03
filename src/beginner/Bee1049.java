package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1049 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		StringBuilder nome = new StringBuilder();
		nome.append(scanner.next());
		nome.append(scanner.next());
		nome.append(scanner.next());

		if (nome.toString().equals("vertebradoaveonivoro")) {
			System.out.println("pomba");
		} else if (nome.toString().equals("vertebradoavecarnivoro")) {
			System.out.println("aguia");
		} else if (nome.toString().equals("vertebradomamiferoonivoro")) {
			System.out.println("homem");
		} else if (nome.toString().equals("vertebradomamiferoherbivoro")) {
			System.out.println("vaca");
		} else if (nome.toString().equals("invertebradoinsetohematofago")) {
			System.out.println("pulga");
		} else if (nome.toString().equals("invertebradoinsetoherbivoro")) {
			System.out.println("herbivoro");
		} else if (nome.toString().equals("invertebradoanelideohematofago")) {
			System.out.println("hematofago");
		} else if (nome.toString().equals("invertebradoanelideoonivoro")) {
			System.out.println("onivoro");
		}

		scanner.close();

	}

}
