public class QuestaoTexto extends QuestaoGeral{
    private String texto;
    public QuestaoTexto(){
        super();
    }
    public QuestaoTexto(Long id, String nome, String texto) {
        super(id, nome);
        this.texto = texto;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    @Override
    public String toString() {
        return "\n QuestaoTexto{" +
                super.toString() +
                "texto='" + texto + '\'' +
                '}';
    }
    public String mensagem(){
        return "Texto";
    }
}
