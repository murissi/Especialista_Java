import java.util.Scanner;

public class TreinoSwitch {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia: (seg, ter..): ");
		String diaSemana = entrada.nextLine();

		String horario; 
			//express switch
			/*
			switch (diaSemana) {
			case "seg","ter","qua" -> "Fechado";
			case "qui", "sex", "sab" -> "Aberto";
			case "dom" -> "Sei la";
			default -> "Dia invalido";
			};
			*/


		// switch antigo 
	/*	switch (diaSemana) {
			case "seg":
				horario = "Fechado";
				break;

			case "ter":
			case "qua":
			case "qui":
				horario = "Aberto";
				break;

			case "sex":
			case "sab":
			case "dom":
				horario = "Aberto ou fechado";
				break;

			default:
				horario = "Dia invalido";
		}	*/


		// Novo switch
	/*	switch (diaSemana) {
			case "seg","ter","qua" -> horario = "Fechado";
			case "qui","sex","sab" -> horario = "Aberto";
			case "dom" -> horario = "Não sei";
			default -> horario = "Dia invalido";
		} */


		System.out.printf("Horario: %s%n", horario);

	} 
}