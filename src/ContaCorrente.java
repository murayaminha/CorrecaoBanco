public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, Cliente cliente, double limite) {
        super(saldo, cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        double saldo = getSaldo();

        if (saldo >= valor) {
            setSaldo(saldo-=valor);
        }
        else if(valor<=(saldo+this.limite)){
           setSaldo(saldo-valor);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositarCheque(Cheque cheque){
        depositar(cheque.getValor());
    }
}