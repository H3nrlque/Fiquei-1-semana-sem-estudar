package Classes;

public class Calc {
    private Integer A;
    private Integer B;
    private Integer C;

    public Calc(Integer a, Integer b) {
        A = a;
        B = b;
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

    public int Calculo() {
        if (A.equals(B)) {
           return C = A + B;
        } else {
           return C = A * B;
        }
    }

    @Override
    public String toString() {
        if (A.equals(B)) {
            return String.format("Os valores %d e %d são iguais, por isso irei soma-los\n",A, B)
                   +"Resultado = "+Calculo();
        } else {
            return String.format("Os valores %d e %d são diferentes, por isso irei multiplica-los\n",A, B)
                    +"Resultado = "+Calculo();
        }
    }
}
