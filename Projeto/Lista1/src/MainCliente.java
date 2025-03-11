import exe2.Cliente;

public class MainCliente {
    public static void main(String args[]){
        Cliente obj1 = new Cliente();
        System.out.println(obj1.exibeDetalhes());
        Cliente obj2 = new Cliente(123, 456, "Pedro", 0);
        System.out.println(obj2.exibeDetalhes());
        obj2.depositar(2000);
        obj2.sacar(1200);
        System.out.println(obj2.exibeDetalhes());

        obj1.sacar(300);

    }
}
