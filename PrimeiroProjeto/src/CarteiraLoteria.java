public class CarteiraLoteria {

    public static void main(String[] args) {
        System.out.println("Imprimindo carteira...\n");

        int totalNumeros = 60;
        int numerosPorLInha = 10;

        for (int i = 0; i < totalNumeros; i++) {
            if (i < 10) {
                System.out.println("0");
            }
            System.out.println(i + " ");

            if (i % numerosPorLInha == 0 || i == totalNumeros){
                System.out.println();
            }

        }

        System.out.printf("%n Cartela com %d números impresso com sucesso%n", totalNumeros);

    }

}
