public class Main {

    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();
        Cachorro seuCachorro = new Cachorro();

        meuCachorro.idade = 4;
        meuCachorro.nome = "Bob";
        meuCachorro.raca = "Rotvailer";
        meuCachorro.sexo = "Macho";

        seuCachorro.sexo = "Femea";
        seuCachorro.raca = "Vira-lata";
        seuCachorro.nome = "Bolinha";
        seuCachorro.idade = 6;

        System.out.printf("Idade: %d%nNome: %s%nRaça: %s%nSexo %s%n",
                meuCachorro.idade, meuCachorro.nome, meuCachorro.raca, meuCachorro.sexo);
        System.out.println();
        System.out.printf("Idade: %d%nNome: %s%nRaça: %s%nSexo %s%n",
                seuCachorro.idade, seuCachorro.nome, seuCachorro.raca, seuCachorro.sexo);


    }
}