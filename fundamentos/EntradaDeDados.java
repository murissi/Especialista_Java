import java.util.Scanner; // importando pacotes 

public class EntradaDeDados {


	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in); // iniciando entrada
		System.out.print("Digite seu nome: ");
		
		String nome  = entrada.nextLine();

		System.out.printf("Oi %s%n!", nome);  

		entrada.close(); // fechando entrada.
	}
}
