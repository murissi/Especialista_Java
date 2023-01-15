public class OperadorIncremento {
	
	public static void main(String[] args) {

		int totalDownloads = 10;
		// totalDownloads += 1;

		// forma pos fixada
		totalDownloads ++; // Vai aumentar o valor em 1
		// totalDownloads ++; Aumenta mais 1 valor no resultado final


		// pre fixada
		int novoTotalDownloads = ++totalDownloads;

		/* Na pre fixada adiciona tanto o valor da variavel quanto o do 
		++ na nova variavel. Já na pos fixada, adiciona o antigo valor na
		nova variavel depois adiona ++ na antiga variavel.
		*/ 

		System.out.println("Total de downloads: " + totalDownloads);
		System.out.println("Novo Total de Downloads: " + novoTotalDownloads);

	}
}