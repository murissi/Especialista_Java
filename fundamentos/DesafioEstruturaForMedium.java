import java.util.Scanner;

public class DesafioEstruturaForMedium {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

			System.out.print("Digite numero inteiro: ");
			int numeroInteiro = entrada.nextInt();

			int numDivisores = 0; 
			for (int i = 1; i <= numeroInteiro; i++) {
				if (numeroInteiro % i == 0) {
					numDivisores++;
				}
			}
			if(numDivisores == 2){
				System.out.printf("Numero %d é primo %n", numeroInteiro);

			}else {
				System.out.printf("Numero %d não é primo %n", numeroInteiro);

			}
		}

	}
