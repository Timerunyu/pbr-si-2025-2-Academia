import java.util.Scanner;

public class CalculosDiversos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Média Aritmética de 3 notas
        System.out.println("1) Média Aritmética de 3 notas:");
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Média: %.2f%n%n", media);

        // 2) Aumento de salário de 25%
        System.out.println("2) Novo salário com aumento de 25%:");
        System.out.print("Digite o salário atual: R$ ");
        double salario = scanner.nextDouble();
        double novoSalario = salario * 1.25;
        System.out.printf("Novo salário: R$ %.2f%n%n", novoSalario);

        // 3) Área de um losango
        System.out.println("3) Área de um losango:");
        System.out.print("Digite a diagonal maior: ");
        double diagonalMaior = scanner.nextDouble();
        System.out.print("Digite a diagonal menor: ");
        double diagonalMenor = scanner.nextDouble();
        double areaLosango = (diagonalMaior * diagonalMenor) / 2;
        System.out.printf("Área do losango: %.2f%n%n", areaLosango);

        // 4) Conversão de Celsius para Fahrenheit
        System.out.println("4) Conversão de Celsius para Fahrenheit:");
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("Temperatura em Fahrenheit: %.2f°F%n%n", fahrenheit);

        // 5) Quantidade de salários mínimos
        System.out.println("5) Quantidade de salários mínimos:");
        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();
        System.out.print("Digite o salário do funcionário: R$ ");
        double salarioFuncionario = scanner.nextDouble();
        double quantidadeSalarios = salarioFuncionario / salarioMinimo;
        System.out.printf("Quantidade de salários mínimos: %.2f%n%n", quantidadeSalarios);

        // 6) Cálculo da hipotenusa
        System.out.println("6) Cálculo da hipotenusa:");
        System.out.print("Digite o valor do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();
        System.out.print("Digite o valor do segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("Hipotenusa: %.2f%n%n", hipotenusa);

        // 7) Cálculos com esfera
        System.out.println("7) Cálculos com esfera:");
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = (4.0 / 3) * Math.PI * Math.pow(raio, 3);
        System.out.printf("Comprimento: %.2f%n", comprimento);
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Volume: %.2f%n", volume);

        scanner.close();
    }
}
