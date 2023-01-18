import java.util.Scanner;

public class WhileMedium {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numerosPrimos = 0;
		int numerosPares = 0;
		
		while (true) {
			System.out.print("Numero inteiro: ");
			int numeroInteiro = entrada.nextInt();

			System.out.print("Terminar programa: ");
			boolean programa = entrada.nextBoolean();
		
			if (numeroInteiro %  2 == 0) {
				numerosPares += numeroInteiro;
			
			} else {
				numerosPrimos += numeroInteiro;
			}
			
			if (programa) {
				break;
			
			} else {
				continue;
			}

		}
		
		System.out.printf("Numeros pares: %d%n", numerosPares);
		System.out.printf("Numeros primos: %d%n", numerosPrimos);
	}
}