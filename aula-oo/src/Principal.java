public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2022;
        meuCarro.modelo = "Carrera";
        meuCarro.cor = "Vermelho";
        meuCarro.fabricante = "Porshe";


        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 1989;
        seuCarro.modelo = "Gol quadrado";
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "Wolskagem";

        System.out.println("Meu carro");
        System.out.println("-------------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %s%n", meuCarro.anoFabricacao);
        System.out.println();

        System.out.println("Seu carro");
        System.out.println("-------------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %s%n", seuCarro.anoFabricacao);

    }
}
