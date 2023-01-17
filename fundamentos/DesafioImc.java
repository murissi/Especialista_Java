import java.util.Scanner;

public class DesafioImc {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu sexo M = 0 | F = 1 ");
		int sexo = entrada.nextInt();

		System.out.print("Digite seu peso: ");
		int peso = entrada.nextInt();

		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);

		if (sexo == 0) { // Homem
			
			if (imc < 20.7) {
				System.out.println("Abaixo do peso");
			
			} else if (imc >= 20.8 && imc <= 26.4) {
				System.out.println("No peso ideal");
			
			} else if (imc >= 20.5 && imc <= 27.8) {
				System.out.println("Um pouco acima do peso");
			
			} else if (imc >= 27.9 && imc <= 31.1) {
				System.out.println("Acima do peso ideal");
			
			} else {
				System.out.println("Obeso");
			} 


		} else {

			if (imc < 19.1) {
				System.out.println("Abaixo do peso");
			
			} else if (imc >= 19.1 && imc <= 25.8) {
				System.out.println("No peso ideal");
			
			} else if (imc >= 25.9 && imc <= 27.3) {
				System.out.println("Um pouco acima do peso");
			
			} else if (imc >= 27.4 && imc <= 32.3) {
				System.out.println("Acima do peso ideal");
			
			} else {
				System.out.println("Obeso");
			} // mulher // mulher

		}
	} 
}