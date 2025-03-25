package exe0;
public class Carro {
    private String marca, modelo;
    private int ano;
    private float velocidade;
    // construtores
    public Carro(){
        this.marca = "sem marca";
        this.modelo = "sem modelo";
    }
    public Carro(String marca, String modelo, int ano, float velocidade){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }

    public void setMarca(String marca){

        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int ano){
        if (ano >= 0) {
            this.ano = ano;
        }
        else System.out.println("Ano não pode ser negativo");
    }
    public void setVelocidade(float velocidade){
        if (velocidade >= 0){
            this.velocidade = velocidade;
        }
        else System.out.println("Velocidade não pode ser negativa");
    }
    // getters
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public float getVelocidade(){
        return this.velocidade;
    }
    public void acelerar(float x){
        this.setVelocidade(this.getVelocidade() + x);
        this.limita100();
    }
    public void frear(float x){
        this.setVelocidade(this.getVelocidade() - x);
    }


    public String exibeDetalhes() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                '}';
    }
    // método privado
    private void limita100(){
        if (this.velocidade > 100){
            this.velocidade = 100;
            System.out.println("Velocidade limitada a 100 km/h");
        }
    }
}
