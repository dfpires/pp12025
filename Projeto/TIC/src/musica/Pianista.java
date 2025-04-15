package musica;
public class Pianista extends Musico {
    private boolean tecladoDigital;
    public Pianista() {
        super();
    }
    public Pianista(String nome, int idade, boolean tecladoDigital) {
        super(nome, idade);
        this.tecladoDigital = tecladoDigital;
    }
    public boolean isTecladoDigital() {
        return tecladoDigital;
    }
    public void setTecladoDigital(boolean tecladoDigital) {
        this.tecladoDigital = tecladoDigital;
    }
    @Override
    public String toString() {
        return "Pianista{" +
                super.toString() +
                "tecladoDigital=" + tecladoDigital +
                '}';
    }
    @Override
    public String tocar(){
        return this.tecladoDigital ?
                "Pianista tocando teclado digital" :
                "Pianista tocando teclado acústico";
    }
}
