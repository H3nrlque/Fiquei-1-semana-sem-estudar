import Classes.SalarioMinimo;

import java.util.Scanner;

public class Salarios {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        double salario = tc.nextDouble();
        SalarioMinimo salarioMinimo = new SalarioMinimo(salario);
        System.out.println(salarioMinimo);
    }
}
