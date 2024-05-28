package Classes;

public class SalarioMinimo {
    private final Double SalarioMin = 1293.20;
    private Double Salario;

    public SalarioMinimo(Double salario) {
        Salario = salario;
    }

    public Double getSalarioMin() {
        return SalarioMin;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public double QuantosSalarios() {
        return Salario / SalarioMin;
    }

    @Override
    public String toString() {
        return String.format("Você ganha o equivalente a %.2f salários mínimos",QuantosSalarios());
    }
}
