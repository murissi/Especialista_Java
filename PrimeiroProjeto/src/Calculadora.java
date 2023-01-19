import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("* = 1 / = 2 + = 3 - = 4\nSelecione valor: ");
        int conta = entrada.nextInt();

        System.out.print("Digite 1 numero: ");
        double primeiroNumero = entrada.nextDouble();

        System.out.print("Digite 2 numero: ");
        double segundoNumero = entrada.nextDouble();

        if (conta == 1) {
            System.out.printf("%.2f * %.2f = %.2f%n",primeiroNumero, conta , segundoNumero, primeiroNumero * segundoNumero);
        }
        else if (conta == 2){
            System.out.printf("%.2f / %.2f = %.2f%n",primeiroNumero, conta , segundoNumero, primeiroNumero / segundoNumero);

        }
        else if (conta == 3){
            System.out.printf("%.2ff + %.2f = %.2f%n",primeiroNumero, conta , segundoNumero, primeiroNumero + segundoNumero);

        }
        else if(conta == 4){
            System.out.printf("%.2f - %.2f = %.2f%n",primeiroNumero, conta , segundoNumero, primeiroNumero - segundoNumero);

        }
        System.out.println("FIM PROGRAMA");

    }
}
