package app.exercicios;
import java.util.Locale;
import java.util.Scanner;
public class Exercicio1 {
   // ERRO CORRIGIDO: O método main precisa de parênteses e do parâmetro (String[] args)
   public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
       // CONVENÇÃO: Variáveis em Java usam "camelCase"
       int alunosNota90 = 0;
       int alunosReprovados = 0;
       int totalDeAlunos = 0;
      
       // BUG LÓGICO CORRIGIDO: maiorNota inicializada com -1.0 para funcionar corretamente
       double maiorNota = -1.0;
       double menorNota = 101.0;
       double somaDasNotas = 0.0;
       System.out.println("--- Análise de Notas da Turma ---");
      
       // MELHORIA DE UX: Usando print para o usuário digitar na mesma linha
       System.out.print("Digite a nota final do aluno (ou negativa para sair): ");
       double nota = leitor.nextDouble();
       while (nota >= 0) {
           System.out.print("Digite o total de faltas: ");
           int faltas = leitor.nextInt();
           totalDeAlunos++;
           somaDasNotas += nota;
           if (nota >= 90) {
               alunosNota90++; // Incrementa o contador
           }
           // Verificar se foi reprovado (por nota ou falta)
           if (nota < 70 || faltas >= 20) {
               alunosReprovados++;
           }
           // Atualiza a maior nota
           if (nota > maiorNota) {
               maiorNota = nota; // Nota atual vira a nova maior nota
           }
          
           // Atualiza a menor nota
           if (nota < menorNota) {
               menorNota = nota; // Nota atual vira a menor nota
           }
           System.out.print("\nDigite a nota do próximo aluno (negativa para sair): ");
           nota = leitor.nextDouble();
       }
       System.out.println("\n--- FIM DA ANÁLISE ---");
       // Verifica se pelo menos um aluno foi inserido para evitar divisão por zero
       if (totalDeAlunos > 0) {
           double mediaDaTurma = somaDasNotas / totalDeAlunos;
           System.out.println("Alunos com nota >= 90: " + alunosNota90);
           System.out.println("Alunos reprovados: " + alunosReprovados);
           System.out.println("Maior nota da turma: " + maiorNota);
           System.out.println("Menor nota da turma: " + menorNota);
           // Usando printf para formatar a saída com 2 casas decimais
           System.out.printf("Média de notas da turma: %.2f\n", mediaDaTurma);
       } else {
           System.out.println("Nenhum dado de aluno foi inserido.");
       }
       leitor.close();
   }
}
