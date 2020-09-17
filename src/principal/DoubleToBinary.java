package principal;

import java.util.Scanner;

public class DoubleToBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String entrada = sc.next();
		int decimal = 0;
		int potencia = 0;

		for (int i = entrada.length() - 1; i >= 0; i--) {
			decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
			potencia++;
		}

		System.out.println(decimal);

		int decimalEntrada = sc.nextInt();
		decimalParaBinario(decimalEntrada);

		sc.close();
	}

	private static void decimalParaBinario(int decimalEntrada) {
		if(decimalEntrada > 0) {
			decimalParaBinario(decimalEntrada / 2);
			System.out.print(decimalEntrada % 2);
		}
	}
}
