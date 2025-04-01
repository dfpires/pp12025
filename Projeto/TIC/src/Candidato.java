import java.util.Date;

public class Candidato {
    private Long id;
    private String nome, endereco, cidade;
    private Date niver;
    // associação

    public Candidato() {
    }
    public Candidato(Long id, String nome, String endereco, String cidade, Date niver) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.niver = niver;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getNiver() {
        return niver;
    }

    public void setNiver(Date niver) {
        this.niver = niver;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cidade='" + cidade + '\'' +
                ", niver=" + niver +
                ", }";
    }
}
