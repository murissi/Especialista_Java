public class Principal {

    public static void main(String[] args) {
        Paciente pessoa01 = new Paciente();

        pessoa01.altura = 1.75;
        pessoa01.peso = 86;

        System.out.printf("IMC: %.2f%n",pessoa01.calcularIdiciceMassaMuscular());
    }
}