import java.util.Scanner;

public class CalculoIndiceMassaCorporal {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Peso: ");
		int peso = entrada.nextInt();

		System.out.print("Altura: ");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);

		
		if (imc < 18.5) { // evite omitir chaves em if  
		
			System.out.println("Abaixo do peso ideal.");
			System.out.println("Procure um nutricionista.");

		} 

		if (imc >= 25 && imc < 30) {
			System.out.println("Acima do peso " + imc);
		}

		if (imc >= 30 && imc < 35) {
			System.out.println("Obesidade grau I");
		}

		System.out.println("Fim do programa.");

	}

}