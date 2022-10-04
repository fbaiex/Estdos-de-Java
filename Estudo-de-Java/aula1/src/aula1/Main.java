package aula1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número de horas Extras: ");
		float horaExt = entrada.nextFloat();
		System.out.println("Digite o número de horas em que faltou: ");
		float hFalta = entrada.nextFloat();
		
		float a = 2;
		float b = 3;
		
		float horas = horaExt - ( a / b * (hFalta));
		
		System.out.println(horas);
		System.out.println(hFalta);
		
		if (horas >= 2401)
		{
			System.out.println("Você fez e vai receber: 500,00");
		} else if(horas >= 1801) {
			System.out.println("Receba o prêmio de R$: 400,00");
		}else if (horas >= 1201){
			System.out.println("Receba o prêmio de R$: 300,00");
		}else if (horas >= 600) {
			System.out.println("Receba o prêmio de R$: 200,00");
		}else {
			System.out.println("Receba o prêmio de R$: 100,00");
		}
	}

}
