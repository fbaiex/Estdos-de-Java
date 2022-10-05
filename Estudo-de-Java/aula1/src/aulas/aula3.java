package aulas;

import java.util.Scanner;

public class aula3 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
	
		System.out.println("Informe a idade: ");
		double idade = leitor.nextDouble();
		
		System.out.println("Informe o seu peso: ");
		double peso = leitor.nextDouble();
		
		if (idade <= 20) {
			if (peso <= 60) {
				System.out.println("Risco 9");
			}
			else if (peso <= 90) {
				System.out.println("Risco 8");
			}
			else if (peso > 90) {
				System.out.println("Risco 7");
			}
		}else if(idade <= 50) {
			if (peso <= 60) {
				System.out.println("Risco 6");
			}else if (peso <= 90) {
				System.out.println("Risco 5");
			}else if (peso > 90) {
				System.out.println("Risco 4");
			}
		}else if (idade > 50) {
			if (peso <= 60) {
				System.out.println("Risco 3");
			}else if (peso <= 90) {
				System.out.println("Risco 2");
			}else if (peso > 90) {
				System.out.println("Risco 1");
			}
		}

	}
}
