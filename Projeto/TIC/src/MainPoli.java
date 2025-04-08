import rh.Assistente;
import rh.Diretor;
import rh.Funcionario;
import rh.Gerente;

import java.util.ArrayList;
import java.util.List;

public class MainPoli {
    // exemplo de polimorfismo
    // o obj vai se comporta como um Assistente, um Gerente ou um Diretor
    // depende do que foi passado como parâmetro
    public static void exemploPolimorfismo(Funcionario obj){
        // obj é um camaleão
        System.out.println(obj.toString());
        System.out.println("Salário final " + obj.calculaSalario());
    }
    public static void main(String[] args) {

        // cria 1 objeto (instância) de cada classe Assistente, Gerente e Diretor
        Assistente as1 = new
Assistente("Fabio", "123", "Centro", 3000, 10);
        Gerente ge1 = new
Gerente("Lucas", "456", "Estação", 5000, 1000);
        Diretor di1 = new
Diretor("Luísa", "789", "Aeroporto", 7000,
                1000);

        exemploPolimorfismo(as1);
        exemploPolimorfismo(ge1);
        exemploPolimorfismo(di1);

        // vetor de funcionários
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        // adicionei funcionários
        funcionarios.add(as1);
        funcionarios.add(ge1);
        funcionarios.add(di1);

        // calcula a folha de pagamento
        // percorre o vetor
        float folha = 0;
        for (Funcionario obj: funcionarios){
            folha += obj.calculaSalario();
        }
        System.out.println("Total gasto pela empresa com salário " + folha);

    }
}