package aula1;

import java.util.Scanner;

public class aula2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idadeC = entrada.nextInt();
		
		if (idadeC < 5) {
			System.out.println("Você não tem idade para participar.");
		} else if (idadeC >= 5 && idadeC <= 7)
		{
			System.out.println("Você está na categoria infantil.");
		} else if(idadeC >= 8 && idadeC <= 10) {
			System.out.println("Você está na categoria juvenil.");
		}else if (idadeC >= 11 && idadeC <= 15){
			System.out.println("Você está na categoria adolescente.");
		}else if (idadeC >= 16 && idadeC <= 30) {
			System.out.println("Você está na categoria adulto.");
		}else if (idadeC > 30) {
			System.out.println("Você está na categoria sênior.");
		}
	}

}
