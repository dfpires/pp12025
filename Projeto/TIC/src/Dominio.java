import java.util.ArrayList;
import java.util.List;

public class Dominio {
    private Long id;
    private String nome;
    private float pontuacao;
    // associação todo-parte
    // List representa um vetor
    private List<QuestaoNumerica> itensDominio;

    public Dominio() {
        // aloca espaço na memória para o vetor
        this.itensDominio = new ArrayList<QuestaoNumerica>();
    }
    public Dominio(Long id, String nome) {
        // aloca espaço na memória para o vetor
        this.id = id;
        this.nome = nome;
        this.itensDominio = new ArrayList<QuestaoNumerica>();
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

    public List<QuestaoNumerica> getItensDominio() {
        return itensDominio;
    }

    public void setItensDominio(List<QuestaoNumerica> itensDominio) {
        this.itensDominio = itensDominio;
    }

    // adiciona um item de domínio no domínio
    public void addItemDominio(QuestaoNumerica itemDominio){
        // adiciona um item de domínio no vetor
        this.itensDominio.add(itemDominio);
        this.calculaPontuacao();
    }
    public void calculaPontuacao(){
        // percorre o vetor de itens de domínio
        float soma = 0;
        for(QuestaoNumerica obj: this.itensDominio){
            // obj representa cada um dos itens de domínio
            soma += obj.getPontuacao();
        }
        this.pontuacao = soma / this.itensDominio.size();
    }

    @Override
    public String toString() {
        return "\nDominio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao +
                ", itensDominio=" + itensDominio +
                '}';
    }
}
