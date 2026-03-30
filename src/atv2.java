
/**
 * 2 - Faça um algoritmo para receber um número
 * qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
 */

import java.util.Scanner;


public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =  sc.nextInt();
        if  (x%2==0 && x>0 ){
            System.out.printf("%d Par e Positivo",x);
        } else if (x%2==0 && x<0) {
            System.out.printf("%d Par e Negativo",x);
        } else if (x%2!=0 && x>0) {
            System.out.printf("%d Impar e Positivo",x);
        } else if (x%2!=0 && x<0) {
            System.out.printf("%d Impar e Negativo",x);
        } else  {
            System.out.printf("erro");
        }
    }
}
