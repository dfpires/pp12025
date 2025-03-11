import exe3.Produto;

public class MainProduto {
    public static void main(String args[]){
        Produto obj1 = new Produto();
        System.out.println(obj1.exibeDetalhes());
        obj1.comprar(3);
        obj1.vender(1);
        obj1.subir(470);
        System.out.println(obj1.exibeDetalhes());

        Produto obj2 = new Produto(123, 10, "bola de basquete", 500);
        obj2.exibeDetalhes();
        obj2.vender(12);
        obj2.descer(540);
        obj2.exibeDetalhes();

    }
}
