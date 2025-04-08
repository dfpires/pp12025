import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QuestaoNumerica id1 = new QuestaoNumerica(11L, "Ver", 100);
        QuestaoNumerica id2 = new QuestaoNumerica(12L, "Ouvir", 100);
        QuestaoBooleana qb1 = new QuestaoBooleana(13L, "Função Mental Global", true);
        QuestaoBooleana qb2 = new QuestaoBooleana(14L, "Função Mental Específica", true);
        QuestaoTexto qt1 = new QuestaoTexto(15L, "Nome", "Lucas");
        QuestaoTexto qt2 = new QuestaoTexto(16L, "Sexo", "Masculino");

        Dominio d1 = new Dominio(1L, "Domínio Sensorial");
        d1.addItemDominio(id1);
        d1.addItemDominio(id2);
        d1.addItemDominio(qb1);
        d1.addItemDominio(qb2);
        d1.addItemDominio(qt1);
        d1.addItemDominio(qt2);

        d1.addMensagem(new QuestaoBooleana());
        d1.addMensagem(new QuestaoNumerica());
        d1.addMensagem(new QuestaoTexto());

        System.out.println(d1);

        Questionario ap1 = new Questionario(100L, "Atividades e Participações ");
        ap1.addDominio(d1);

         Candidato c1 = new
Candidato(300L, "Pedro", "Estação", "Franca", new Date());

        System.out.println(c1);

        Resposta r1 = new Resposta(400L, c1, ap1, new Date());

        System.out.println(r1.toString());

    }
}