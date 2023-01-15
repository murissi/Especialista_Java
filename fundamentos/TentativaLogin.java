public class TentativaLogin {
	
	public static void main(String[] args) {

		int limiteLogin = 10;
		// int novoLimiteLogin = limiteLogin--; | Modifica somente a primeira variavel
		int novoLimiteLogin = --limiteLogin; // Modifica todas as variaveis;
		

		System.out.println("Limite Login: " + limiteLogin);
		System.out.println("Novo Limite: " + novoLimiteLogin);
	}

}