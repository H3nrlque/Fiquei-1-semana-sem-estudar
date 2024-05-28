import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = tc.nextInt();
        Verificacao(n);



    }

    public static void Verificacao(int n) {
        if (n % 2 == 0) {
            System.out.printf("O número %d é Par",n);
        } else {
            System.out.printf("O número %d é Impar",n);
        }
    }




}
