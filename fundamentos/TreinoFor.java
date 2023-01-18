import java.util.Scanner;

public class TreinoFor {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o numero de passageiros: ");
		int numeroPassageiros = entrada.nextInt();

		System.out.print("Peso maximo suportado: ");
		int pesoMaximo = entrada.nextInt();

		int pesoTotal = 0;
		for (int cadaPassageiro = 1; cadaPassageiro <= numeroPassageiros; cadaPassageiro++ ){
			System.out.printf("Peso do passageiro %d: ",cadaPassageiro);
			int pesoRecebido = entrada.nextInt();
			pesoTotal+= pesoRecebido;
		}

		System.out.printf("Peso total %dkg. %n",pesoTotal);
		System.out.printf("Peso maximo: %dkg.%n",pesoMaximo);
		System.out.println(pesoTotal > pesoMaximo ? "Voo invalido" : "Voo valido");
	}

}