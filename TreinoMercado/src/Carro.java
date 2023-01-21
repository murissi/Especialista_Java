public class Carro {

    String marca;
    String modelo;
    int placa;
    Pessoa proprietario;
    int anoFabricacao;
    double precoCompra;

    // declarando metodos
    double calcularValorRevenda() {

        int tempoUsoAnos = 2022 - anoFabricacao;
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoUsoAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;

        }

        return valorRevenda;
    }


}
