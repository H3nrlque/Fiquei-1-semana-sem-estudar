import Classes.Valores;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int A = tc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = tc.nextInt();
        System.out.print("Digite o valor de C: ");
        int C = tc.nextInt();
        Valores valores = new Valores(A, B, C);
        System.out.println(valores);




    }
}
