public class OperadoresIgualdadeNegacao {
	
	public static void main(String[] args) {

		boolean numerosIguais = 10 != 10; // diferente
		boolean numeros = (4 + 6) == (5 * 2);
		int numero1 = 10;
		boolean numeroVariavel = numero1 == 2;
		int numero2 = 10;


		System.out.println(numerosIguais);
		System.out.println(numeros);
		System.out.println(numeroVariavel);
		System.out.println(numero1 == numero2);
		System.out.printf("Numero Diferentes: %b%n", numero1 != numero2);

		System.out.println(); 	

		// operador de negacao
		System.out.printf("Negacao %b%n", !numeros);
		System.out.printf("Negacao %b%n", !numeroVariavel);
		
		boolean numerosDiferentes = !(1 == 1);
		System.out.println(numerosDiferentes);

		System.out.println();

		// Comparacao de Strings 

		String nome1 = "Thiago";
		String nome2 = "Miguel";

		System.out.printf("Nomes iguais %s x %s = %b%n", nome1, nome2, nome1 == nome2); 

		// Existem formas melhores de comparar String em java. 

	}
}