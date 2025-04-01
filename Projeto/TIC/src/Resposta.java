import java.util.Date;
public class Resposta {
    private Long id;
    private Candidato candidato;
    private Questionario questionario;
    private Date data;
    public Resposta(){
        this.candidato = new Candidato();
        this.questionario = new Questionario();
        this.data = new Date();
    }

    public Resposta(Long id, Candidato candidato, Questionario questionario, Date data) {
        this.id = id;
        this.candidato = candidato;
        this.questionario = questionario;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Questionario getQuestionario() {
        return questionario;
    }

    public void setQuestionario(Questionario questionario) {
        this.questionario = questionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Resposta{" +
                "id=" + id +
                ", candidato=" + candidato +
                ", questionario=" + questionario +
                ", data=" + data +
                '}';
    }
}
