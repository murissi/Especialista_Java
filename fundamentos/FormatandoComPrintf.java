public class FormatandoComPrintf {
	
	public static void main(String[] args) {

		String nome1 = "Thiago";
		int quantidade = 48;
		double peso = 938.22;

		System.out.printf("Seu nome é: %s%n", nome1); // %n quebra linha
		System.out.printf("Quantidade: %d%n", quantidade);
		System.out.printf("Peso: %10.2f%n",peso); //%10. = mostra quantos caracteres a gente quer.
	}
}
