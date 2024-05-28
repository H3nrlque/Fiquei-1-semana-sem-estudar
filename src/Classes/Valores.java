package Classes;

public class Valores {
    private Integer A;
    private Integer B;
    private Integer C;

    public Valores(Integer a, Integer b, Integer c) {
        A = a;
        B = b;
        C = c;
    }

    public Integer getA() {
        return A;
    }

    public void setA(Integer a) {
        A = a;
    }

    public Integer getB() {
        return B;
    }

    public void setB(Integer b) {
        B = b;
    }

    public Integer getC() {
        return C;
    }

    public void setC(Integer c) {
        C = c;
    }

    public int SomaAeB() {
        return A + B;
    }

    public String MaiorouMenor() {
        if (SomaAeB() < C) {
            return "A soma é menor do que o valor de C\n";
        } else {
            return "A soma é maior do que o valor de C\n";
        }
    }

    @Override
    public String toString() {
        return "Valor de C = "+C+"\n"
                +String.format("A soma de %d + %d = %d\n",A, B, SomaAeB())
                +MaiorouMenor();
    }
}
