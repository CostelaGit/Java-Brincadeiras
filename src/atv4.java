import java.util.Scanner;

/**
 * Faça um algoritmo que receba um número inteiro e
 * imprima na tela o seu antecessor e o seu sucessor.
 */

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Antecessor: %d | Sucessor: %d ", n-1 , n+1);
    }
}
