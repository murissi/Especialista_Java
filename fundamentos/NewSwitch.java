import java.util.Scanner;

public class HorarioFuncionamento {
	
	public static void main(String[] args) {

	// arrow label

	Scanner entrada = new Scanner(System.in);

	System.out.print("Digite um dia da semana (seg, ter, qua): ");
	String diaSemana = entrada.nextLine();
	String horarioFuncionamento = 	
		switch (diaSemana) {
		case "seg" -> "Fechado";
		case "ter","qua","qui","sex" -> "08:00 às 18:00";
		case "sab", "dom" -> "08:00 às 12:00";
		default -> "Dia invalido!"; // switch expression obriga a colocar default.
	}; // switch expressions
	

	/*
	switch (diaSemana) {

	case "seg" -> horarioFuncionamento = "Fechado";
	case "ter","qua","qui","sex" -> horarioFuncionamento = "08:00 às 18:00";
	case "sab", "dom" -> horarioFuncionamento = "08:00 às 12:00";
	default -> horarioFuncionamento = "Dia invalido!";
	
	}
	*/



	System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);

	}
}