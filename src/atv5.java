import java.util.Scanner;

/**
 *  Faça um algoritmo que leia o
 *  valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
 *  usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20)
 */

public class atv5 {

    final static double salarioMinimo = 1293.20;

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salario abaixo: ");
        double salarioUsuario = sc.nextDouble();
        double qtdSalarios = salarioUsuario/salarioMinimo;
        System.out.println("quantidades de salarios minimos: " + qtdSalarios);
    }
}
