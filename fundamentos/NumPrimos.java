import java.util.Scanner;

public class NumPrimos {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Numero inteiro: ");
		int numeroInteiro = entrada.nextInt();
		int contador = 0;

		for (int i = 1; i <= numeroInteiro; i++) {
			if(numeroInteiro % i == 0) {
				contador++;
			} 
		}

		if (contador == 2) {
			System.out.printf("Numero: %d é primo%n", numeroInteiro);

		} else {
			System.out.printf("Numero: %d não é primo%n", numeroInteiro);
		}


	}
}