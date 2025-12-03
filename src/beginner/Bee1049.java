package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1049 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		StringBuilder chave = new StringBuilder();
		chave.append(scanner.next());
		chave.append(scanner.next());
		chave.append(scanner.next());

		String nome = chave.toString();

		if (nome.toString().equals("vertebradoaveonivoro")) {
			System.out.println("pomba");
		} else if (nome.equals("vertebradoavecarnivoro")) {
			System.out.println("aguia");
		} else if (nome.equals("vertebradomamiferoonivoro")) {
			System.out.println("homem");
		} else if (nome.equals("vertebradomamiferoherbivoro")) {
			System.out.println("vaca");
		} else if (nome.equals("invertebradoinsetohematofago")) {
			System.out.println("pulga");
		} else if (nome.equals("invertebradoinsetoherbivoro")) {
			System.out.println("lagarta");
		} else if (nome.equals("invertebradoanelideohematofago")) {
			System.out.println("sanguessuga");
		} else if (nome.equals("invertebradoanelideoonivoro")) {
			System.out.println("minhoca");
		}

		scanner.close();

	}

}
