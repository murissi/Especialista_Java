import java.util.Scanner;

public class FreteTreino {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Valor do produto: ");
		int valorProduto = entrada.nextInt();


		System.out.print("Pagar frete: ");
		boolean frete = entrada.nextBoolean();

		double valorFrete;

		if (frete) {
			System.out.print("Valor frete: ");
			valorFrete = entrada.nextDouble();
		
		} else {
			valorFrete = 0;
		}

		System.out.printf("R$%.2f%n", valorProduto + valorFrete);

	}
}