package exe2;
public class Aluno {
    private int nroAluno;
    private String nome;
    private int idade;
    private float p1, p2;

    public int getNroAluno() {
        return nroAluno;
    }

    public void setNroAluno(int nroAluno) {
        // método de classe
        String auxiliar = String.valueOf(nroAluno);
        if (auxiliar.length() == 6) {
            this.nroAluno = nroAluno;
        }
        else System.out.println("Problema no tamanho");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public String exibeAluno() {
        return "Aluno{" +
                "nroAluno=" + nroAluno +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
