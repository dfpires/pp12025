public class QuestaoNumerica {
    private Long id;
    private String nome;
    private float pontuacao;

    public QuestaoNumerica() {
    }

    public QuestaoNumerica(Long id, String nome, float pontuacao) {
        this.id = id;
        this.nome = nome;
        this.pontuacao = pontuacao;
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

    @Override
    public String toString() {
        return "\nQuestaoNumerica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pontuacao=" + pontuacao +
                '}';
    }
}
