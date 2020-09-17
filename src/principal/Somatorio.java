package principal;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = somatorio(sc.nextInt());
		System.out.print(valor);
		sc.close();
	}
	
	public static int somatorio(int num) {
		if(num == 1) {
			return 1;
		}
		return num + somatorio(num - 1);
	}
}
