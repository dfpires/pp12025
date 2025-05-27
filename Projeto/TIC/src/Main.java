import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QuestaoNumerica q1 = new QuestaoNumerica(11L, "Ver", 100);
        QuestaoNumerica q2 = new QuestaoNumerica(12L, "Ouvir", 100);
        Dominio d1 = new Dominio(1L, "Domínio Sensorial");
        d1.addQuestao(q1);
        d1.addQuestao(q2);

        QuestaoNumerica q3 = new QuestaoNumerica(13L, "Comunicar-se / Recepção de mensagens", 100);
        QuestaoNumerica q4 = new QuestaoNumerica(14L, "Comunicar-se / Produção de mensagens", 100);
        QuestaoNumerica q5 = new QuestaoNumerica(15L, "Conversar", 100);
        QuestaoNumerica q6 = new QuestaoNumerica(16L, "Discutir", 100);
        QuestaoNumerica q7 = new QuestaoNumerica(17L, "Utilização de dispositivos de comunicação à distância", 100);
        Dominio d2 = new Dominio(1L, "Domínio Comunicação");
        d2.addQuestao(q3);
        d2.addQuestao(q4);
        d2.addQuestao(q5);
        d2.addQuestao(q6);
        d2.addQuestao(q7);

        Questionario quest1 = new Questionario(100L, "Atividades e Participações ");
        quest1.addDominio(d1);
        quest1.addDominio(d2);

         Candidato c1 = new
Candidato(300L, "Pedro", "Estação", "Franca", new Date());

        Resposta r1 = new Resposta(400L, c1, quest1, new Date());

        System.out.println(r1.toString());

    }
}