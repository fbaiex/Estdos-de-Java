package aulas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número de horas Extras: ");
		double horaExt = entrada.nextDouble();
		System.out.println("Digite o número de horas em que faltou: ");
		double hFalta = entrada.nextDouble();
		
		double resultado = (horaExt - (2/3 * (hFalta)))*60;
		
		System.out.println(resultado);
		System.out.println(hFalta);
		
		if (resultado >= 2401)
		{
			System.out.println("Você fez e vai receber: 500,00");
		} else if(resultado >= 1801) {
			System.out.println("Receba o prêmio de R$: 400,00");
		}else if (resultado >= 1201){
			System.out.println("Receba o prêmio de R$: 300,00");
		}else if (resultado >= 600) {
			System.out.println("Receba o prêmio de R$: 200,00");
		}else {
			System.out.println("Receba o prêmio de R$: 100,00");
		}
	}

}
