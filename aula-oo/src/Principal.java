public class Principal {

    public static void main(String[] args) {

        Carro meuCarro = new Carro();

        double valorRevendaMeuCarro = meuCarro.calcularValorRevenda();
        double tempoUsoMeuCarro = meuCarro.calcularTempoUsoAnos();
        System.out.printf("Tepo de uso %d%n",
                meuCarro.calcularTempoUsoAnos());

        System.out.printf("Valor de revenda: %6.1f%n",
                );
    }
}
