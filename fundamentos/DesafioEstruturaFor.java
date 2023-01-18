import java.util.Scanner;

public class DesafioEstruturaFor {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numeros; 
		int calculo = 0;
		for (int numero = 10;numero >= 1;numero--){
			System.out.printf("Digite %d numero: ", numero);
			numeros = entrada.nextInt();
			calculo += numeros;

			while (numeros %  2 != 0) {
				System.out.println("Numero Invalido");
				System.out.printf("Digite %d numero: ", numero);
				numeros = entrada.nextInt();
							
			}
		}

		System.out.printf("Soma total: %d%n", calculo);	 
	}
}