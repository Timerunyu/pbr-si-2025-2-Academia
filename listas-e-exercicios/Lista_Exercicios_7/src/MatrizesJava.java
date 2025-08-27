import java.util.Scanner;

public class MatrizesJava{

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
        int[][] matriz = new int[5][5];

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // a) Imprimir matriz
        System.out.println("\nMatriz informada:");
        imprimirMatriz(matriz);

        // b) Imprimir elementos com linha par e coluna ímpar
        System.out.println("\nElementos em posições [linha par][coluna ímpar]:");
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { // linha par
                for (int j = 0; j < 5; j++) {
                    if (j % 2 == 1) { // coluna ímpar
                        System.out.println("Matriz[" + i + "][" + j + "] = " + matriz[i][j]);
                    }
                }
            }
        }
    }

    // ---------------- Parte 2 ----------------
    public static void parte2(Scanner scanner) {
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] soma = new int[2][2];

        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        // Soma
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Exibir matrizes
        System.out.println("\nMatriz 1:");
        imprimirMatriz(matriz1);

        System.out.println("\nMatriz 2:");
        imprimirMatriz(matriz2);

        System.out.println("\nMatriz Soma:");
        imprimirMatriz(soma);
    }

    // ---------------- Parte 3 ----------------
    public static void parte3(Scanner scanner) {
        int[][] matriz = new int[6][6];

        System.out.println("Digite os elementos da matriz 6x6:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // a) Apresentar matriz
        System.out.println("\nMatriz informada:");
        imprimirMatriz(matriz);

        // b) Soma das colunas pares e c) ímpares
        int somaPares = 0;
        int somaImpares = 0;

        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                if (j % 2 == 0) {
                    somaPares += matriz[i][j];
                } else {
                    somaImpares += matriz[i][j];
                }
            }
        }

        // d) Diferença
        int diferenca = somaPares - somaImpares;

        // e) Apresentar valores
        System.out.println("Soma das colunas pares: " + somaPares);
        System.out.println("Soma das colunas ímpares: " + somaImpares);
        System.out.println("Diferença (pares - ímpares): " + diferenca);
    }

    // ---------------- Função para imprimir matrizes ----------------
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%4d", elemento);
            }
            System.out.println();
        }
    }
}
