import java.util.Scanner;

public class VetoresJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1
        System.out.println("=== Parte 1 ===");
        parte1(scanner);

        // Parte 2
        System.out.println("\n=== Parte 2 ===");
        parte2(scanner);

        // Parte 3
        System.out.println("\n=== Parte 3 ===");
        parte3(scanner);

        scanner.close();
    }

    // ---------------- Parte 1 ----------------
    public static void parte1(Scanner scanner) {
        int[] vetor = new int[10];

        // a) Ler vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // a) Imprimir vetor
        System.out.print("Vetor lido: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        // b) Soma dos pares
        int somaPares = 0;
        for (int num : vetor) {
            if (num % 2 == 0) {
                somaPares += num;
            }
        }
        System.out.println("Soma dos números pares: " + somaPares);

        // c) Posições com números negativos
        System.out.print("Posições com números negativos: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // d) Menor e maior número
        int menor = vetor[0], maior = vetor[0];
        for (int num : vetor) {
            if (num < menor) menor = num;
            if (num > maior) maior = num;
        }
        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);

        // e) Elementos nas posições ímpares
        System.out.print("Elementos nas posições ímpares: ");
        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    // ---------------- Parte 2 ----------------
    public static void parte2(Scanner scanner) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] soma = new int[10];

        // Ler vetor1
        System.out.println("Digite os 10 números do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor1[" + i + "]: ");
            vetor1[i] = scanner.nextInt();
        }

        // Ler vetor2
        System.out.println("Digite os 10 números do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            vetor2[i] = scanner.nextInt();
        }

        // Soma os elementos
        for (int i = 0; i < 10; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        // Exibir os vetores
        System.out.print("Vetor 1: ");
        for (int num : vetor1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Vetor 2: ");
        for (int num : vetor2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Vetor Soma: ");
        for (int num : soma) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // ---------------- Parte 3 ----------------
    public static void parte3(Scanner scanner) {
        int[] vetor = new int[10];

        // Ler vetor
        System.out.println("Digite 10 números para o vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        int soma1 = 0, soma2 = 0;

        // a) Soma dos 5 primeiros
        for (int i = 0; i < 5; i++) {
            soma1 += vetor[i];
        }

        // b) Soma dos 5 últimos
        for (int i = 5; i < 10; i++) {
            soma2 += vetor[i];
        }

        // c) Diferença
        int diferenca = soma1 - soma2;

        // d) Apresentar
        System.out.println("Soma da primeira metade: " + soma1);
        System.out.println("Soma da segunda metade: " + soma2);
        System.out.println("Diferença (1ª - 2ª): " + diferenca);
    }
}
