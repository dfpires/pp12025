public class QuestaoGeral {
    protected Long id;
    protected String nome;

    public QuestaoGeral() {
        this.nome = "sem nome";
    }

    public QuestaoGeral(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "QuestaoGeral{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
