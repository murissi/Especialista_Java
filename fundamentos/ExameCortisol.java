import java.util.Scanner;

public class ExameCortisol {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Cortisol: ");
		double cortisol = entrada.nextDouble();

		// cortisol ideal 6 ate 18.4

		boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
		boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;

		System.out.printf("Cortisol Normal: %b%n", resultadoNormal);
		System.out.printf("Cortisol Anormal: %b%n", resultadoAnormal);

	}
}