import java.util.Scanner;

public class Lista5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            // Menu de opções
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Calcular Fatorial");
            System.out.println("2 - Calcular Média das Idades");
            System.out.println("3 - Calcular Potência (sem Math.pow)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    calcularFatorial(sc);
                    break;

                case 2:
                    calcularMediaIdades(sc);
                    break;

                case 3:
                    calcularPotencia(sc);
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0); // Repete até o usuário escolher sair

        sc.close();
    }

    // ===== Exercício 1: Calcular Fatorial =====
    public static void calcularFatorial(Scanner sc) {
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! O fatorial não é definido para números negativos.");
        } else {
            int fatorial = 1;

            // Faz a multiplicação de n até 1
            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }

    // ===== Exercício 2: Média das Idades =====
    public static void calcularMediaIdades(Scanner sc) {
        int soma = 0;
        int contador = 0;
        int idade;

        System.out.println("Digite as idades (digite 0 para parar):");

        for (;;) { // Laço infinito até digitar 0
            idade = sc.nextInt();

            if (idade == 0) {
                break; // Para o loop
            }

            soma += idade;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }

    // ===== Exercício 3: Potência =====
    public static void calcularPotencia(Scanner sc) {
        System.out.print("Digite a base: ");
        int base = sc.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1;

        for (int i = 1; i <= expoente; i++) {
            resultado *= base; // Multiplica a base expoente vezes
        }

        System.out.println(base + " elevado a " + expoente + " é: " + resultado);
    }
}