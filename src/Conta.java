public class Conta {
    private double saldo;
    private Cliente cliente;

    public Conta(){
    }
    public Conta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public void sacar(double valor){
        if(this.saldo>valor){
            this.saldo-=valor;
        }
        else {
            System.out.println("saldo insuficiente");
        }
    }
    public void depositar(double valor){
        if (valor>0){
            this.saldo+=valor;
            System.out.println("depósito realizado com sucesso");
        }
        else {
            System.out.println("valor inválido");
        }
    }
    public void consultarSaldo(){
        System.out.println("saldo atual ="+this.saldo);
    }
public void consultarDado(Conta conta){
    System.out.println("Numero da conta " + conta.getCliente().getNumeroDoCliente());
}
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
