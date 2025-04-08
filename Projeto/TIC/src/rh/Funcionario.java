package rh;
// classe abstrata - não pode ser instanciada
public abstract class Funcionario {
    // protected -> pública para as filhas e privada para demais
    protected String nome, cpf, endereco;
    protected float salario;

    public Funcionario() {
        this.nome = "sem nome";
        this.cpf = "sem cpf";
        this.endereco = "sem endereco";
    }
    public Funcionario(String nome, String cpf, String endereco, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario +
                '}';
    }
    public abstract float calculaSalario();

}
