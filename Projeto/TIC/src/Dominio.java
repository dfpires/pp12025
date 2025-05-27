import java.util.ArrayList;
import java.util.List;

public class Dominio {
    private Long id;
    private String nome;
    private float pontuacao;
    // associação todo-parte
    // List representa um vetor
    private List<QuestaoGeral> questoes;


    public Dominio() {
        // aloca espaço na memória para o vetor
        this.questoes = new ArrayList<QuestaoGeral>();
    }
    public Dominio(Long id, String nome) {
        // aloca espaço na memória para o vetor
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<QuestaoGeral>();
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

    public List<QuestaoGeral> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<QuestaoGeral> questoes) {
        this.questoes = questoes;
    }

    // adiciona um item de domínio no domínio
    public void addQuestao(QuestaoGeral questao){
        // itemDominio é um objeto polimórfico
        // pois ele pode receber uma QuestaoNumerica, uma
        // QuestaoBooleana, ou uma QuestaoTexto
        // adiciona um item de domínio no vetor
        this.questoes.add(questao);
        this.calculaPontuacao();
    }



    public void calculaPontuacao(){
        // percorre o vetor de itens de domínio
        float soma = 0;
        for(QuestaoGeral obj: this.questoes){
            // obj representa cada um dos itens de domínio
         //   soma += obj.getPontuacao();
        }
        this.pontuacao = soma / this.questoes.size();
    }

    @Override
    public String toString() {
       return "\nDominio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao +
                ", Questões=" + questoes +
                '}';
    }
}
