import java.util.List;

public class Dominio {
    private Long id;
    private String nome;
    private float pontuacao;
    // associação todo-parte
    // List representa um vetor
    private List<ItemDominio> itensDominio;

    public Dominio() {
    }

    public Dominio(Long id, String nome, float pontuacao, List<ItemDominio> itensDominio) {
        this.id = id;
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.itensDominio = itensDominio;
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

    public List<ItemDominio> getItensDominio() {
        return itensDominio;
    }

    public void setItensDominio(List<ItemDominio> itensDominio) {
        this.itensDominio = itensDominio;
    }

    @Override
    public String toString() {
        return "Dominio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao +
                ", itensDominio=" + itensDominio +
                '}';
    }
}
