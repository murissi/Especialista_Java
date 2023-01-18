import java.util.Scanner;

public class TreinoWhile {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Iniciar programa? ");
		boolean programa = entrada.nextBoolean();

		String nome;
		int idade;
		while(programa) {
			System.out.print("Digite seu nome: ");
			nome = entrada.nextLine();


			System.out.print("Digite sua idade: ");
			idade = entrada.nextInt();



			System.out.println("Para programa? ");
			boolean parar = entrada.nextBoolean();
			
			if (parar) {
				break;
			} else {
				continue;
			}
		}




	}
}