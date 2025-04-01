public class QuestaoBooleana {
    private Long id;
    private String nome;
    private boolean marcado;

    public QuestaoBooleana() {
    }

    public QuestaoBooleana(Long id, String nome, boolean marcado) {
        this.id = id;
        this.nome = nome;
        this.marcado = marcado;
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

    public boolean getMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    @Override
    public String toString() {
        return "\nQuestaoBooleana{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", marcado =" + marcado +
                '}';
    }
}
