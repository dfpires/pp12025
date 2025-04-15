package musica;
public class Baterista extends Musico {
    private int nroTambores;
    public Baterista() {
        super();
    }

    public Baterista(String nome, int idade, int nroTambores) {
        super(nome, idade);
        this.nroTambores = nroTambores;
    }

    public int getNroTambores() {
        return nroTambores;
    }

    public void setNroTambores(int nroTambores) {
        this.nroTambores = nroTambores;
    }

    @Override
    public String toString() {
        return "Baterista{" +
                super.toString() +
                "nroTambores=" + nroTambores +
                '}';
    }

    @Override
    public String tocar(){
        return "Baterista fazendo batida com " + this.nroTambores
                + "tambores";
    }
}
