package br.com.unifacef.bdrestful.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "formulario_id")
    private Formulario formulario;

    @ManyToOne @JoinColumn(name = "candidato_id")
    private Candidato candidato;

    @ManyToOne @JoinColumn(name = "questionario_id")
    private Questionario questionario;

    @ManyToOne @JoinColumn(name = "questao_id")
    private Questao questao;

    private Integer pontuacao;
    private Date dataHora;

    private Double respostaNumerica;
    private Boolean respostaBooleana;
    private String respostaTexto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
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

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Double getRespostaNumerica() {
        return respostaNumerica;
    }

    public void setRespostaNumerica(Double respostaNumerica) {
        this.respostaNumerica = respostaNumerica;
    }

    public Boolean getRespostaBooleana() {
        return respostaBooleana;
    }

    public void setRespostaBooleana(Boolean respostaBooleana) {
        this.respostaBooleana = respostaBooleana;
    }

    public String getRespostaTexto() {
        return respostaTexto;
    }

    public void setRespostaTexto(String respostaTexto) {
        this.respostaTexto = respostaTexto;
    }
}
