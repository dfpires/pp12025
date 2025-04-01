import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QuestaoNumerica id1 = new QuestaoNumerica(11L, "Ver", 100);
        QuestaoNumerica id2 = new QuestaoNumerica(12L, "Ouvir", 100);

        Dominio d1 = new Dominio(1L, "Domínio Sensorial");
        d1.addItemDominio(id1);
        d1.addItemDominio(id2);
      //  System.out.println(d1); // chama toString() do d1

        Questionario ap1 = new Questionario(100L, "Atividades e Participações ");
        ap1.addDominio(d1);
      //  System.out.println(ap1);

        Candidato c1 = new
Candidato(300L, "Pedro", "Estação", "Franca", new Date());

   //     System.out.println(c1);

        Resposta r1 = new Resposta(400L, c1, ap1, new Date());

        System.out.println(r1.toString());

    }
}