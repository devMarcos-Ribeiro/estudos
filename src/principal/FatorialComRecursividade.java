package principal;

import java.util.Scanner;

public class FatorialComRecursividade {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int valor = fatorial(sc.nextInt());
		System.out.printf("%d", valor);
		sc.close();
	}
	
	private static int fatorial(int num) {
		if(num == 0) {
			return 1;
		}
		return num * fatorial(num - 1);
	}
}
