import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		while (true) {
			System.out.print("Numero inteiro: ");
			int inteiroNovo = entrada.nextInt();
			numero+= inteiroNovo;

			if (numero >= 100) {
				System.out.printf("Numero: %d%n",numero);
				break;
			} else {
				continue;
			}

		}
	}
}