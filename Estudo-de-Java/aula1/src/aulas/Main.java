package aulas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de horas Extras: ");
		float horaExt = entrada.nextFloat();
		System.out.println("Digite o n�mero de horas em que faltou: ");
		float hFalta = entrada.nextFloat();
		
		float a = 2;
		float b = 3;
		
		float resultado = horaExt - ( a / b * (hFalta));
		
		if (resultado >= 2401)
		{
			System.out.println("Voc� fez e vai receber: 500,00");
		} else if(resultado >= 1801) {
			System.out.println("Receba o pr�mio de R$: 400,00");
		}else if (resultado >= 1201){
			System.out.println("Receba o pr�mio de R$: 300,00");
		}else if (resultado >= 600) {
			System.out.println("Receba o pr�mio de R$: 200,00");
		}else {
			System.out.println("Receba o pr�mio de R$: 100,00");
		}
	}

}