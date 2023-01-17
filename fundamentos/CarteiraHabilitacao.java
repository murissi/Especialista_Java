import java.util.Scanner;

public class CarteiraHabilitacao {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Você tem habilitação(S|N)? ");
		String habilitacao = entrada.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();


		if (idade >= 18) {

			if (habilitacao == "S") {
				System.out.print("Parabens, você pode dirigir! ");

			} else {
				System.out.print("Infelizmente você não pode dirigir! ");

			
			} 

		}

	}
}