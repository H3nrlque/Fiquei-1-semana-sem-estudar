import Classes.Calc;

import java.util.Scanner;

public class SomaouMultiplicacao {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int A = tc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = tc.nextInt();
        Calc calc = new Calc(A, B);
        System.out.println(calc);
    }
}
