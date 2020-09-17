package principal;

import java.util.Scanner;

public class FIbonacciRecursivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		for (int i = 0; i <= valor; i++) {
			System.out.print(fibonacciRecursivo(i) + " ");
		}
		sc.close();
	}
	
	public static int fibonacciRecursivo(int num) {
		if(num < 2) {
			return 1;
		}
		return fibonacciRecursivo(num -1) + fibonacciRecursivo(num - 2);
	}
}
