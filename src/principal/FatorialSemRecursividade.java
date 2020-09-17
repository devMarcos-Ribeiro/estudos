package principal;

import java.util.Scanner;

public class FatorialSemRecursividade {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int valor = calculaFatorial(sc.nextInt());
		System.out.printf("%d",valor);
		sc.close();
	}
	
	public static int calculaFatorial(int numero) {
		int total = 1;
		for (int i = numero; i > 1; i--) {
			total *= i;
		}
		return total;
	}
}
