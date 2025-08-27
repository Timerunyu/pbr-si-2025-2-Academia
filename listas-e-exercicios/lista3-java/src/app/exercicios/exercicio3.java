package app.exercicios;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio3{
	public static void main(String[]args) {
		
		Scanner Leitor = new Scanner(System.in).useLocale(Locale.US);
		
		int canal2 = 0, canal4= 0, canal5= 0, canal7= 0, canal12= 0;
		int totalEspectadores=0;
		System.out.println("--- Pesquisa de audiencia de TV--- ");
		
		System.out.print("Digite o numero do canal (2,4 5, 7 ou 12) ou 0 para encerrar");
		int canal = Leitor.nextInt();
		
		
		while(canal != 0 ) {
			System.out.print("Digite o numero de pessoas assistindo");
			int pessoas = Leitor.nextInt();
			
			switch(canal) {
			case 2:
				canal2+=pessoas;
				totalEspectadores +=pessoas;
				break;
				
			
		case 4:
           canal4 += pessoas;
           totalEspectadores += pessoas;
           break;
       case 5:
           canal5 += pessoas;
           totalEspectadores += pessoas;
           break;
       case 7:
           canal7 += pessoas;
           totalEspectadores += pessoas;
           break;
       case 12:
           canal12 += pessoas;
           totalEspectadores += pessoas;
           break;
           default:
           	
           	 System.out.println("Canal inválido. Os dados desta casa não serão computados.");
                break;
               
               
		}
			 // 5. Lendo o PRÓXIMO canal para controlar o loop
           System.out.print("\nDigite o próximo canal (ou 0 para encerrar): ");
           canal = Leitor.nextInt();
		
	}
		System.out.println("/n --- Percentual de audiencia---");
		
		//evitar divisao por 0
		if (totalEspectadores >0) {
			 double percCanal2 = (double) canal2 / totalEspectadores * 100;
	            double percCanal4 = (double) canal4 / totalEspectadores * 100;
	            double percCanal5 = (double) canal5 / totalEspectadores * 100;
	            double percCanal7 = (double) canal7 / totalEspectadores * 100;
	            double percCanal12 = (double) canal12 / totalEspectadores * 100;
	            System.out.printf("Canal 2: %.2f%%\n", percCanal2);
	            System.out.printf("Canal 4: %.2f%%\n", percCanal4);
	            System.out.printf("Canal 5: %.2f%%\n", percCanal5);
	            System.out.printf("Canal 7: %.2f%%\n", percCanal7);
	            System.out.printf("Canal 12: %.2f%%\n", percCanal12);
		} else {
			
			System.out.println("Nenhum dado de audiencia foi inserido");
			
		}
		Leitor.close();
	}
}
