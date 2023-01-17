import java.util.Scanner;

public class ExameVitaminaD {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Grupo de risco: ");
		boolean grupoDeRisco = entrada.nextBoolean();

		System.out.print("Vitamina D: ");
		double vitaminaD = entrada.nextDouble(); // nanograma por militro

		boolean vitaminaDnormal = !grupoDeRisco  && vitaminaD > 20
			|| grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60;

		System.out.printf("Vitamina D normal: %b%n", vitaminaDnormal);

	}
}