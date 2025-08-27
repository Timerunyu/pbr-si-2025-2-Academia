import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos salarios
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = sc.nextDouble();

        // Cálculo
        double qtdSalarios = salarioFuncionario / salarioMinimo;

        // Saída
        System.out.printf("O funcionário recebe %.2f salários mínimos.%n", qtdSalarios);

        sc.close();
    }
}