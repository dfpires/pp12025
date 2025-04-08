package rh;
public class Assistente extends Funcionario {
    private float horaExtra;
    public Assistente(){
       super(); // chama construtor sem parâmetro do pai
    }
    public Assistente(String nome, String cpf, String endereco, float salario, float horaExtra) {
        // chama construtor com parâmetro do pai
        super(nome, cpf, endereco, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }
    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override // anulação de método
    public String toString() {
        return "Assistente{" +
                super.toString() +
                "horaExtra=" + horaExtra +
                '}';
    }
    @Override
    public float calculaSalario(){

        return this.salario + (this.horaExtra * 30);
    }
}
