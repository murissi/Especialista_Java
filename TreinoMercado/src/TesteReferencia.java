public class TesteReferencia {

    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Pessoa pessoa01 = new Pessoa();
        carro01.proprietario = pessoa01;


        Carro carro02 = new Carro();
        carro02.proprietario = pessoa01;


        Carro carro03 = new Carro();
        carro03.proprietario = pessoa01;

        Carro carro04 = new Carro();
        carro04.proprietario = pessoa01;

        carro04.proprietario.nome = "Matuzalem";
        carro04.proprietario.cpf = "1343917341920412u";
        carro04.proprietario.cnh = "19834712934";

    }
}
