import java.util.Scanner;

public class analiseDeNumeros {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		// declare suas variaveis corretamente
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		int numeros[] = new int[5];

		// continue a solução
		for (int i = 0; i < 5; i++) {
			numeros[i] = leitor.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if (numeros[i] % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}

			if (numeros[i] > 0) {
				positivo += 1;
			} else if (numeros[i] < 0) {
				negativo += 1;
			}

		}
		// insira suas variaveis corretamente
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");

	}

}
