package br.com.unifacef.bdrestful.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity // classe será uma tabela no banco de dados
public class Candidato {
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome, endereco, cidade;
    private Date niver;

    // associação com o formulário
    @ManyToOne
    @JoinColumn (name = "formulario_id")
    private Formulario formulario;

   public Long getId() {
        return id;
   }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getNiver() {
        return niver;
    }

    public void setNiver(Date niver) {
        this.niver = niver;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }
}
