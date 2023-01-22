public class Carro {

    String fabricante; // variavel de instancia
    String modelo;
    String cor;
    int anoFabricacao;
    Pessoa proprietario;
    double precoCompra;

    int calcularTempoUsoAnos() {
        return 2022 - anoFabricacao;
    }

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2022 - anoFabricacao;
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }
    }

}
