package musica;
import java.util.ArrayList;
import java.util.List;
public class Recital {
    private String tema;
    // associação
    private List<Musico> musicos;
    public Recital() {
        this.tema = "sem tema";
        // aloca espaço na memória para o vetor
        this.musicos = new ArrayList<Musico>();
    }
    public Recital(String tema){
        this.tema = tema;
        // aloca espaço na memória para o vetor
        this.musicos = new ArrayList<Musico>();
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public List<Musico> getMusicos() {
        return musicos;
    }
    // adiciona um músico no recital
    public void addMusico(Musico musico){
        // musico pode se comportar como baterista, guitarrista
        // ou pianista
        this.musicos.add(musico);
    }
    // apresentar todos
    public void apresentarTodos(){
        for(Musico obj : this.musicos){
            // polimorfismo -> obj vai executar toString
            // de classes diferentes
            System.out.println(obj.tocar());
        }
    }
    public String resumeRecital(){
        this.apresentarTodos();
        return "Qtde músicos " + this.musicos.size() +
                " Tema: " + this.tema;
    }

}
