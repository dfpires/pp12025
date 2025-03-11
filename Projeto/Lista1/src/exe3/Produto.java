package exe3;
public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;
    public Produto(){
        this.descricao = "sem descrição";
    }

    public Produto(int id, int qtde, String descricao, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    public void comprar(int x){
        this.qtde += x; System.out.println("Comprado");
    }
    public void subir(float x){
        this.preco += x; System.out.println("Aumentado");
    }
    public void vender(int x){
        if (this.qtde >= x){
            this.qtde -= x; System.out.println("Vendido");
        }
        else {
            System.out.println("Estoque insuficiente");
        }
    }
    public void descer(float x){
        if (this.preco >= x){
            this.preco -= x; System.out.println("Descido");
        }
        else {
            System.out.println("Preço não pode ser negativo");
        }
    }

    public String exibeDetalhes() {
        return "Produto{" +
                "id=" + id +
                ", qtde=" + qtde +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
