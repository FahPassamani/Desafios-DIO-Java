import java.util.Scanner;

public class seisNumerosImpares {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x = leitor.nextInt();
		int cont = 0;

//continue a solucao de acordo com o solicitado no enunciado

		while (cont < 6) {
			if (x % 2 == 1) {
				System.out.println(x);
				cont++;
			}
			x++;
		}

	}

}
