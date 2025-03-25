package exe1;
public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;

    public Cliente() {
        this.nome = "sem nome";
        this.nroConta = "111111-1";
        this.nroAgencia = "1111-1";
    }
    public Cliente(String nroConta, String nroAgencia, String nome, float saldo) {
        this.setNroConta(nroConta);
        this.setNroAgencia(nroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    public String getNroConta() {
        return nroConta;
    }
    public void setNroConta(String nroConta) {
        // métodos de instância
        if (nroConta.length() == 8){
            if (nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else System.out.println("Problema no DV");
        }
        else System.out.println("Problema no tamanho");

    }
    public String getNroAgencia() {
        return nroAgencia;
    }
    public void setNroAgencia(String nroAgencia) {
        if (nroAgencia.length() == 6){
            if (nroAgencia.charAt(4) == '-'){
                this.nroAgencia = nroAgencia;
            }
            else {
                this.nroAgencia = "1111-1";
                System.out.println("Problema no tamanho");
            }
        }
        else {
            this.nroAgencia = "1111-1";
            System.out.println("Problema com DV");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Problema no tamanho");
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Saldo negativo");
    }
    // depositar para o cliente
    public void depositar(float valor){
        this.setSaldo(this.saldo + valor);
    }
    // sacar
    public void sacar(float valor){
        this.setSaldo(this.saldo - valor);
    }
    public String exibeCliente() {
        return "Cliente{" +
                "nroConta='" + nroConta + '\'' +
                ", nroAgencia='" + nroAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
