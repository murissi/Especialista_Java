import java.util.Scanner;

public class DesafioString {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Valor por hora: ");
		double valorHora = entrada.nextDouble();

		System.out.print("Digite sua horas trabalhadas: ");
		int horasTrabalho = entrada.nextInt();

		System.out.print("Digite valor de desconto: ");
		double valorDesconto = entrada.nextInt();



		System.out.printf("Folha de pagamento: %s%n%d horas x R$: %.2f = R$ %.2f%nDescontos: R$ %.2f%nTotal devido: %.2f%n", 
			nome, horasTrabalho, valorHora, (horasTrabalho * valorHora), valorDesconto, (horasTrabalho * valorHora));
	}
}