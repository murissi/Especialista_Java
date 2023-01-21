public class Main {

    public static void main(String[] args) {

    Carro meuCarro = new Carro();
    Carro seuCarro = new Carro();

    meuCarro.modelo = "xr5";
    meuCarro.marca = "Audi";
    meuCarro.placa = 13124;
    meuCarro.anoFabricacao = 2010;
    meuCarro.precoCompra = 120.000;

    seuCarro.modelo = "zzy6";
    seuCarro.anoFabricacao = 2000;
    seuCarro.placa = 39432;
    seuCarro.marca = "HOnda";
    seuCarro.precoCompra = 500.000;

    System.out.printf("Tempo de uso: %d%n", 2023 - meuCarro.anoFabricacao);
    System.out.printf("Valor revenda: %6.2f%n",
            meuCarro.calcularValorRevenda());
    }
}