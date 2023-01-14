public class OperadoresAritmeticos {
	
	public static void main(String[] args) {

		int minhaIdade = 40;
		int suaIdade = 25;

		// Adição
		int totalIdades = (minhaIdade + suaIdade);

		// Subtração
		int diferencaIdade = (minhaIdade - suaIdade);

		// Multiplicação
		int multiplicacaoIdade = (2 * suaIdade);

		// Divisão
		int divisaoIdade = (suaIdade / 2);

		// Modulo 
		int resto = 7 % 2;

		System.out.println("Soma idades: " + totalIdades); 
		System.out.println("Diferença idades: " + diferencaIdade);
		System.out.println("Dobro idade: " + multiplicacaoIdade);
		System.out.println("Metadade idade: " + divisaoIdade);
		System.out.println("Resto divisao: " + resto);



	}
}