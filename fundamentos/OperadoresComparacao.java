public class OperadoresComparacao {
	
	public static void main(String[] args) {

		int pesoProdutos = 1000;
		int limitePesoCaminhao = 1000;

		boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;

		System.out.printf("Peso maior limite: %b%n", cargaExcedida);

		boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;
		System.out.printf("Carga Liberada: %b%n", cargaLiberada);

	}
}