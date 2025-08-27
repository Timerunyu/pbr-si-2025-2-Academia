package app.exercicios;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio2 {
  
   public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
     
       System.out.println("--- Verificação de Situação do Aluno ---");
      
       System.out.print("Informe a matrícula do aluno (ou negativa para sair): ");
       int matricula = leitor.nextInt();
       // Loop principal
       while (matricula >= 0) {
           System.out.print("Digite a primeira nota: ");
           double nota1 = leitor.nextDouble();
           System.out.print("Digite a segunda nota: ");
           double nota2 = leitor.nextDouble();
           System.out.print("Digite a terceira nota: ");
           double nota3 = leitor.nextDouble();
           // Calcular média
         
           double media = (nota1 + nota2 + nota3) / 3.0;
          
         
           System.out.printf("Aluno %d | Média %.2f | Situação: ", matricula, media);
           // Verificação da situação
           if (media >= 70) {
               System.out.println("APROVADO");
           } else if (media >= 60) {
              
               System.out.println("RECUPERAÇÃO");
           } else {
               System.out.println("REPROVADO");
           }
          
           System.out.print("\nDigite a matrícula do próximo aluno (ou negativa para sair): ");
           matricula = leitor.nextInt();
       }
       System.out.println("\n--- Programa encerrado. ---");
 
       leitor.close();
   }
}
