package rh;
public class Diretor extends Funcionario{
    private float acoesEmpresa;
    public Diretor(){
        super();
    }
    public Diretor(String nome, String cpf, String endereco, float salario, float acoesEmpresa){
        super(nome, cpf, endereco, salario);
        this.acoesEmpresa = acoesEmpresa;
    }
    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }
    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }
    @Override
    public String toString() {
        return "Diretor{" +
                super.toString() +
                "acoesEmpresa=" + acoesEmpresa +
                '}';
    }
    @Override
    public float calculaSalario() {

        return this.salario + (this.acoesEmpresa * 7) / 12;
    }
}
