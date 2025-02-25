package exe0;
import javax.swing.*;

public class Carro {
    // varíaveis
    // do tipo primitivo
    public int ano;
    public float velocidade;
    // do tipo classe
    public String marca, modelo;

    // métodos construtores
    public Carro(){ // sem parâmetros
        this.marca = "Marca inválida";
        this.modelo = "Modelo inválido";
    }
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    // métodos
    public void exibirDetalhes(){
        // this representa o objeto que chama o método
        JOptionPane.showMessageDialog(null,
                "Marca: " + this.marca +
                " Modelo " + this.modelo +
                " Ano: " + this.ano +
                " Velocidade " + this.velocidade);
    }

    // vai acelerar o carro de X unidades
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }
    public void frear(float x){
        if (this.velocidade - x >= 0){
            this.velocidade -= x;
        }
        else {
            System.out.println("Não é possível frear");
        }
    }


}
