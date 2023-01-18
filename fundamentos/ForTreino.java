import java.util.Scanner;

public class ForTreino {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("------Compras------\n");

		System.out.print("Digite o valo maximo compras: ");
		int maximoCompras = entrada.nextInt();

		System.out.print("Quantas unidades: ");
		int unidades = entrada.nextInt();

		int gastoTotal = 0;
		for (int unidade = 1; unidade <= unidades; unidade++){
			System.out.print("Valor unidade: ");
			int unitario = entrada.nextInt();

			gastoTotal += unitario;

		}

		System.out.printf("Total livre: R$%d%n", maximoCompras);
		System.out.printf("Gasto total: R$%d%n", gastoTotal);
		System.out.println(gastoTotal > maximoCompras ? "Valor insuficiente" : "Compra realizada");

	}
}
