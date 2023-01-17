import java.util.Scanner;

public class CaixaLoja {
	
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);

	System.out.print("Preco dos produtos: ");
	double precoProdutos = entrada.nextDouble();

	System.out.print("Cobrar frete? ");
	boolean cobrarFrete = entrada.nextBoolean();

	double valorFrete;
	
	if (cobrarFrete) {
		System.out.print("Valor do frete: ");
		valorFrete = entrada.nextDouble();
	} else {
		valorFrete = 0;
	}

	double valorTotal = precoProdutos + valorFrete; 

	System.out.printf("Valor total: R$%.2f%n", valorTotal);
	}

}

// Variavel criada em um bloco so pode ser usada dentro do bloco