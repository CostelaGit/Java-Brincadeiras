/**
 * 1 - Faça um algoritmo que leia os valores de A, B, C e em
 * seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
 */

import java.util.Scanner;


public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a seguir: A, B e C");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C  = sc.nextDouble();
        double Soma = A + B;
        if (Soma < C){
            System.out.println("Menor ou igual a C");
        }
    }
}