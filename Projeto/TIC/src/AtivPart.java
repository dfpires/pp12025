import java.util.List;

public class AtivPart {
    private Long id;
    private String nome;
    private float pontuacao;
    // associação todo-parte
    private List<Dominio> dominios;

    public AtivPart() {
    }

    public AtivPart(Long id, String nome, float pontuacao, List<Dominio> dominios) {
        this.id = id;
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.dominios = dominios;
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

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }

    public List<Dominio> getDominios() {
        return dominios;
    }

    public void setDominios(List<Dominio> dominios) {
        this.dominios = dominios;
    }

    @Override
    public String toString() {
        return "AtivPart{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao +
                ", dominios=" + dominios +
                '}';
    }
}
