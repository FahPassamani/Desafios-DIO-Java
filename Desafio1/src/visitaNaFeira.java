import java.io.IOException;
import java.util.Scanner;

public class visitaNaFeira {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int total = a + b; // Altere o valor da vari�vel com o c�lculo esperado

		System.out.println("X = " + total);

	}

}
