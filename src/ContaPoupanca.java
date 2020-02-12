public class ContaPoupanca extends Conta {
    private double taxaJuros;


    public ContaPoupanca(double saldo, Cliente cliente, double taxaJuros) {
        super(saldo, cliente);
        this.taxaJuros = taxaJuros;
    }

    public ContaPoupanca() {
    }

    public void recolherJuros() {
        setSaldo(getSaldo() + (getSaldo() * this.taxaJuros));
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
