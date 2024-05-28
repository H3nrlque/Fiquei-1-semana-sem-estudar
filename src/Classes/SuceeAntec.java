package Classes;

public class SuceeAntec {
    private Integer n;

    public SuceeAntec(Integer n) {
        this.n = n;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public int Sucessor() {
        return n + 1;
    }

    public int Antecessor() {
        return n - 1;
    }

    @Override
    public String toString() {
        return "Antecessor de "+n+" = "+Antecessor()+"\n"
               +"Sucessor de "+n+" = "+Sucessor();
    }
}
