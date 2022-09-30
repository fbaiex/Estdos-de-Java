package aula1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int premio;
		
		System.out.print("Digite o número de horas: ");
		
		premio = entrada.nextInt();
		
		
		if (premio >= 2401)
		{
			System.out.println("Receba o prêmio de R$: 500,00");
		} else if(premio >= 1801) {
			System.out.println("Receba o prêmio de R$: 400,00");
		}else if (premio >= 1201){
			System.out.println("Receba o prêmio de R$: 300,00");
		}else if (premio >= 600) {
			System.out.println("Receba o prêmio de R$: 200,00");
		}else {
			System.out.println("Receba o prêmio de R$: 100,00");
		}
	}

}
