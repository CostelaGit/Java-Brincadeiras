import java.util.Scanner;

/**
 * Faça um algoritmo que leia dois valores
 * inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
 * caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se
 * atribuir o resultado a uma variável C e imprimir seu valor na tela.
 */

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c;
        if (a == b){
            c = a + b;
            System.out.println(c);
        } else {
            c = a * b;
            System.out.println(c);
        }

    }
}
