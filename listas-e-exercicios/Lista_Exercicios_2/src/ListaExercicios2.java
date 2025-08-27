import java.util.Scanner;

public class ListaExercicios2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        do {

            //Menuzinho pra facilitar a navegação
            System.out.println("\nInforme qual programa deseja acessar:");
            System.out.println("1. Média");
            System.out.println("2. IMC");
            System.out.println("3. Preço do Produto");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            N = sc.nextInt();

            switch (N) {
                case 1:
                    // Questão 1 - Média e situação
                    System.out.println("Digite as 3 notas do aluno (0 a 10):");
                    double n1 = sc.nextDouble();
                    double n2 = sc.nextDouble();
                    double n3 = sc.nextDouble();

                    double media = (n1 + n2 + n3) / 3;
                    System.out.printf("Média: %.2f\n", media);

                    if (media >= 0 && media < 3) {
                        System.out.println("Situação: REPROVADO");
                    } else if (media >= 3 && media < 7) {
                        System.out.println("Situação: EXAME");
                    } else if (media >= 7 && media <= 10) {
                        System.out.println("Situação: APROVADO");
                    } else {
                        System.out.println("Valor de nota inválido!");
                    }
                    break;

                case 2:
                    // Questão 2 - IMC
                    System.out.println("\nDigite o peso (kg):");
                    double peso = sc.nextDouble();

                    System.out.println("Digite a altura (m):");
                    double altura = sc.nextDouble();

                    double imc = peso / (altura * altura);
                    System.out.printf("IMC: %.2f\n", imc);

                    if (imc < 20) {
                        System.out.println("Situação: Abaixo do Peso");
                    } else if (imc >= 20 && imc < 25) {
                        System.out.println("Situação: Normal");
                    } else if (imc >= 25 && imc < 30) {
                        System.out.println("Situação: Sobrepeso");
                    } else if (imc >= 30 && imc < 40) {
                        System.out.println("Situação: Obesidade");
                    } else {
                        System.out.println("Situação: Obesidade Mórbida");
                    }
                    break;

                case 3:
                    // Questão 3 - Preço do produto
                    System.out.println("\nDigite o código do produto (1 a 5):");
                    int codigo = sc.nextInt();

                    switch (codigo) {
                        case 1:
                            System.out.println("Produto: Sapato - R$ 99,99");
                            break;
                        case 2:
                            System.out.println("Produto: Bolsa - R$ 103,89");
                            break;
                        case 3:
                            System.out.println("Produto: Camisa - R$ 49,98");
                            break;
                        case 4:
                            System.out.println("Produto: Calça - R$ 89,72");
                            break;
                        case 5:
                            System.out.println("Produto: Blusa - R$ 97,35");
                            break;
                        default:
                            System.out.println("Código inválido!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (N != 0);

        sc.close();
    }
}
