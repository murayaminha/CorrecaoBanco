public class Cliente {
    private String sobrenome;
    private int numeroDoCliente;
    private String cpf;
    private String rg;

    public Cliente(String sobrenome, int numeroDoCliente, String cpf, String rg) {
        this.sobrenome = sobrenome;
        this.numeroDoCliente = numeroDoCliente;
        this.cpf = cpf;
        this.rg = rg;
    }
    public Cliente(){}

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getNumeroDoCliente() {
        return numeroDoCliente;
    }

    public void setNumeroDoCliente(int numeroDoCliente) {
        this.numeroDoCliente = numeroDoCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
