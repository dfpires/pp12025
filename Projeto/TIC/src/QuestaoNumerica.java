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

    @Override
    public String toString() {
        return super.toString() +
                ", Número = " + numero +
                '}';
    }
}
