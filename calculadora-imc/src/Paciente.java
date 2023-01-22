public class Paciente {

    double peso;
    double altura;

    IndiceMassaCorporal calcularIdiciceMassaMuscular() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        double imcCalculado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        
        return imcCalculado;
    }

}
