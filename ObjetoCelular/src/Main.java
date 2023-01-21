public class Main {

    public static void main(String[] args) {
        Celular celular01 = new Celular();
        celular01.modelo = "Pro x";
        celular01.ano = 2022;
        celular01.marca = "Iphone";
        celular01.proprietario = new Dono();
        celular01.proprietario.cpf = "073.769.581-18";
        celular01.proprietario.idade = 22;
        celular01.proprietario.nome = "Lucas Vinicius";

        Celular celular02 = new Celular(); // criando objeto celular
        celular02.marca = "Samsung";
        celular02.ano = 23;
        celular02.modelo = "s23";
        celular02.proprietario = new Dono();
        celular02.proprietario.nome = "Thiago";
        celular02.proprietario.idade = 12;
        celular02.proprietario.cpf = "123.332.343-13";

    }
}