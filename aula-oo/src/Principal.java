public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2022;
        meuCarro.modelo = "Carrera";
        meuCarro.cor = "Vermelho";
        Pessoa eu = new Pessoa();
        eu.nome = "Thiago Faria";
        eu.cpf = "111.222.333-44";
        eu.anoNascimento = 1981;
        meuCarro.proprietario = eu;

        Pessoa voce = new Pessoa();
        Carro seuCarro = new Carro();
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "x6";
        seuCarro.anoFabricacao = 2022;
        voce.cpf = "999.999.999-99";
        voce.nome = "Joao das Couves";
        voce.anoNascimento = 1992;
        seuCarro.proprietario = voce;



//        meuCarro.fabricante = "Porshe";
//        meuCarro.proprietario = new Pessoa();
//        meuCarro.proprietario.nome = "Lucas Vinicius";
//        meuCarro.proprietario.anoNascimento = 2000;
//        meuCarro.proprietario.cpf = "073.769.581-18";



      /*  Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 1989;
        seuCarro.modelo = "Gol quadrado";
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "Wolskagem";*/

        System.out.println("Meu carro");
        System.out.println("-------------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %s%n", meuCarro.anoFabricacao);
        System.out.println();
/*
        System.out.println("Seu carro");
        System.out.println("-------------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %s%n", seuCarro.anoFabricacao);
*/

    }
}
