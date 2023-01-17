import java.util.Scanner;

public class ImcTreino {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu IMC: ");
		final int imc = entrada.nextInt();

		boolean resultadoImc = imc > 20 && imc < 40
			|| imc == 42;		


		System.out.printf("IMC normal: %b%n", resultadoImc); 
	}
}