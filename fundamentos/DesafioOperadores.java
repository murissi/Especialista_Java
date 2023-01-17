import java.util.Scanner;

public class DesafioOperadores {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite ano: ");

		int ano = entrada.nextInt();

		boolean anoBissextos = ano % 100 != 0 && ano % 400 == 0 
			|| ano % 4 == 0;
		System.out.printf("Ano bissexto: %b%n", anoBissextos);


	}
}