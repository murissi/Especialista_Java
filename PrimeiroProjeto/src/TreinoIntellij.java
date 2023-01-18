import java.util.Scanner;

public class TreinoIntellij {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome; ");
        String nome = entrada.nextLine();

        System.out.printf("Seja bem vindo! %s%n", nome);

        System.out.printf("%s, Selecione um numero primo: ", nome);
        int numeroPrimo = entrada.nextInt();
        int contador = 0;

        for (int i = 1; i <= numeroPrimo; i++) {
            if (numeroPrimo % i == 0) {
                contador++;
            }

        }
        if (contador == 2) {
            System.out.printf("%s, seu numero %d é primo!", nome, numeroPrimo);

        } else {
            System.out.printf("%s, seu numero %d não é primo!", nome, numeroPrimo);
        }

    }
}
