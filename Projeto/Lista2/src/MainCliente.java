import exe1.Cliente;

public class MainCliente {
    public static void main(String args[]){
        Cliente obj1 = new Cliente();
        System.out.println(obj1.exibeCliente());

        Cliente obj2 =
new Cliente("1234-x", "123-x", "Paulo", 1000);

        obj2.depositar(3000);
        obj2.sacar(800);
        System.out.println(obj2.exibeCliente());
    }
}
