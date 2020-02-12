public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        ContaPoupanca contaPoupanca = new ContaPoupanca(100,cliente,0.05);
        contaPoupanca.consultarSaldo();
        ContaCorrente contaCorrente = new ContaCorrente(100,cliente,100);
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
        Cheque cheque=new Cheque(20,"bradesc0","20/12/12");
        contaCorrente.depositarCheque(cheque);
        contaCorrente.consultarSaldo();
    }
}
