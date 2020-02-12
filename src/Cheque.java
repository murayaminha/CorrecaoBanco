public class Cheque {
    private double valor;
    private String banco;
    private String data;

    public Cheque(double valor, String banco, String data) {
        this.valor = valor;
        this.banco = banco;
        this.data = data;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
