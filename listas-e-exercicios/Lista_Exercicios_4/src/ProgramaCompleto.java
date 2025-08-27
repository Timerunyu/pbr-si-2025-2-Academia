import java.util.Scanner;

public class ProgramaCompleto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Validação de dados
        System.out.println("=== Parte 1: Validação de Dados ===");
        validarDados(scanner);

        // Parte 2: Média das notas
        System.out.println("\n=== Parte 2: Média das Notas ===");
        calcularMediaNotas(scanner);

        // Parte 3: Jogo do número secreto
        System.out.println("\n=== Parte 3: Jogo do Número Secreto ===");
        jogarNumeroSecreto(scanner);

        scanner.close();
    }

    // ---------------- Parte 1 ----------------
    public static void validarDados(Scanner scanner) {
        double nota;
        do {
            System.out.print("Informe a nota (0 a 100): ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada inválida. Digite um número: ");
                scanner.next();
            }
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 100);

        double salario;
        do {
            System.out.print("Informe o salário (maior que 0): ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada inválida. Digite um número: ");
                scanner.next();
            }
            salario = scanner.nextDouble();
        } while (salario <= 0);

        char sexo;
        do {
            System.out.print("Informe o sexo (m/f): ");
            sexo = scanner.next().toLowerCase().charAt(0);
        } while (sexo != 'm' && sexo != 'f');

        int idade;
        do {
            System.out.print("Informe a idade (0 a 110): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
                scanner.next();
            }
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 110);

        System.out.println("Todos os dados foram informados corretamente.");
    }

    // ---------------- Parte 2 ----------------
    public static void calcularMediaNotas(Scanner scanner) {
        double soma = 0;
        int count = 0;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        String continuar;

        do {
            double nota;
            do {
                System.out.print("Digite uma nota (0 a 10): ");
                while (!scanner.hasNextDouble()) {
                    System.out.print("Entrada inválida. Digite um número: ");
                    scanner.next();
                }
                nota = scanner.nextDouble();
            } while (nota < 0 || nota > 10);

            soma += nota;
            count++;
            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;

            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = scanner.next().toLowerCase();

        } while (continuar.equals("s"));

        if (count > 0) {
            double media = soma / count;
            System.out.printf("Menor nota: %.2f\n", menor);
            System.out.printf("Média das notas: %.2f\n", media);
            System.out.printf("Maior nota: %.2f\n", maior);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
    }

    // ---------------- Parte 3 ----------------
    public static void jogarNumeroSecreto(Scanner scanner) {
        String jogarNovamente;
        do {
            int numeroSecreto = (int) (Math.random() * 100) + 1;
            int tentativa;
            boolean acertou = false;

            System.out.println("Tente adivinhar o número secreto entre 1 e 100.");
            System.out.println("Digite -1 para desistir.");

            while (true) {
                System.out.print("Seu palpite: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Entrada inválida. Digite um número inteiro: ");
                    scanner.next();
                }
                tentativa = scanner.nextInt();

                if (tentativa == -1) {
                    System.out.println("Você desistiu. O número era: " + numeroSecreto);
                    break;
                }

                if (tentativa < 1 || tentativa > 100) {
                    System.out.println("Palpite fora do intervalo! Tente entre 1 e 100.");
                    continue;
                }

                if (tentativa == numeroSecreto) {
                    System.out.println("Parabéns! Você acertou o número secreto!");
                    acertou = true;
                    break;
                } else if (tentativa < numeroSecreto) {
                    System.out.println("O número secreto é maior.");
                } else {
                    System.out.println("O número secreto é menor.");
                }
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            jogarNovamente = scanner.next().toLowerCase();

        } while (jogarNovamente.equals("s"));

        System.out.println("Obrigado por jogar!");
    }
}
