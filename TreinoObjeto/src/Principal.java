import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = new entrada.nextLine();

        System.out.print("Digite sua altura: ");
        int altura = new entrada.nextInt();

        System.out.print("Digite seu peso: ");
        int peso = new entrada.nextInt();

        System.out.println(calcularImc(peso, altura));

    }
}