import java.util.Scanner;

public class TreinoSwitch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Selecione o dia |seg|ter|qua: ");
        String diasSemana = entrada.nextLine();

        String diaSelecionado = switch (diasSemana) {
            case "seg", "ter", "qua" -> "Hello world!";
            case "qui", "sex", "sab" -> "Goodbye world!";
            case "dom" -> "GGGGGG";
            default -> "Dia invalido";
        };

        System.out.println(diaSelecionado);
        System.out.println(diasSemana);

    }
}

