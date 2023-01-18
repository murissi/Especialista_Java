import java.util.Scanner;

public class ControleAeronaveWhile {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Peso máximo da aeronave: ");
		int pesoMaximo = entrada.nextInt();

		System.out.print("Quantidade de passageiros: ");
		int totalPassageiros = entrada.nextInt();

		int pesoTotalPassageiros = 0;

		while (pesoTotalPassageiros <= pesoMaximo) {
			System.out.print("Peso do pasageiro: ");
			int pesoPassageiro = entrada.nextInt();

			pesoTotalPassageiros += pesoPassageiro;

		}

		System.out.printf("Peso maximo da aeronave: %d kg%n", pesoMaximo);
		System.out.printf("Peso total dos passageiros: %d kg%n", pesoTotalPassageiros);
		System.out.printf("Situacao aeronave:: %s%n",
			pesoTotalPassageiros > pesoMaximo ? "peso excedido" : "liberada");

	
	}
}