import java.util.Scanner;

public class TreinoPrimo {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Numero inteiro: ");
		int numeroPrimo = entrada.nextInt();

		int contador = 0;

		for (int i = 1; i <= numeroPrimo; i++) {
			if (numeroPrimo % i == 0) {
				contador++;
			}

		}	
		
		if (contador == 2) {
			System.out.printf("Numero %d primo %n", numeroPrimo);
		
		} else {
			System.out.printf("Numero %d não é primo%n", numeroPrimo);
		}

	}
}