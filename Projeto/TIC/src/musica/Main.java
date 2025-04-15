package musica;

public class Main {
    public static void main(String[] args) {
        Guitarrista g1 =
new Guitarrista("Douglas", 42, "Elétrica");
        Baterista b1 =
new Baterista("Carlos", 50, 3);
        Pianista p1 =
new Pianista("Julio", 55, false);
        // cria uma instância de Recital
        Recital r1 = new Recital("Sexta-feira santa");
        // adiciona os músicos
        r1.addMusico(g1);
        r1.addMusico(b1);
        r1.addMusico(p1);

        System.out.println(r1.resumeRecital());
    }
}
