
/**
 * Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
 */


import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salario abaixo: ");
        double valorQualquer = sc.nextDouble();
        valorQualquer *= 1.05;
        System.out.println("Valor Reajustado 5%: " + valorQualquer);
    }
}
