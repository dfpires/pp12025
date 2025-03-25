import java.util.Date;

public class Candidato {
    private Long id;
    private String nome, endereco, cidade;
    private Date niver;
    // associação
    private AtivPart ativPart;

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

    public AtivPart getAtivPart() {
        return ativPart;
    }

    public void setAtivPart(AtivPart ativPart) {
        this.ativPart = ativPart;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cidade='" + cidade + '\'' +
                ", niver=" + niver +
                ", ativPart=" + ativPart +
                '}';
    }
}
