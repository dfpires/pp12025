public class QuestaoNumerica extends QuestaoGeral{
    private int numero;

    public QuestaoNumerica() {
        super(); // chama o construtor da superclasse
    }

    public QuestaoNumerica(Long id, String nome, int numero) {
        super(id, nome); // chama o construtor da superclasse
        this.numero = numero;
    }
    public float getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override // anulação de método da superclasse
    public String toString() {
        return "\n QuestaoNumerica" +
                super.toString() +
                ", Número = " + numero +
                '}';
    }
    public String mensagem(){
        return "Numérica";
    }
}
