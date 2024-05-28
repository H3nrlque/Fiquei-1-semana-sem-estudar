import Classes.SuceeAntec;

import java.util.Scanner;

public class SucessoreAntecessor {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n = tc.nextInt();
        SuceeAntec verif = new SuceeAntec(n);
        System.out.println(verif);



    }
}
