package aula1;

public class Main {

	public static void main(String[] args) {

		int premio = 599;
		
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
