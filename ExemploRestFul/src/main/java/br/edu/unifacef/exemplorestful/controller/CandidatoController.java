package br.edu.unifacef.exemplorestful.controller;

import br.edu.unifacef.exemplorestful.model.Candidato;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController// controlador Restful das requisições
@RequestMapping("/candidato")
public class CandidatoController {
    // cria um vetor que contém objetos da classe Candidato
    private List<Candidato> candidatos = new ArrayList<>();

    @GetMapping
    public List<Candidato> getCandidatos(){
        return this.candidatos;
    }

    @PostMapping
    public Candidato addCandidato(@RequestBody Candidato candidato){
        this.candidatos.add(candidato);
        return candidato;
    }

    @DeleteMapping("/{id}")
    public String deleteCandidato(@PathVariable Long id){
        // removeIf faz o for percorrendo e verificando igualdade de id
        // se encontrar, remove e retorna true
        // se não encontrar, não remove e retorna false
        boolean resp = this.candidatos.removeIf(candidato -> candidato.getId() == id);
        return resp ? "Candidato removido": "Candidato não encontrado";
    }
    @PutMapping("/{id}")
    public String updateCandidato(@PathVariable Long id,
                                  @RequestBody Candidato candidato){
            // para cada candidato c do vetor candidatos
            for(Candidato c : candidatos){
                if(c.getId() == id){
                    // encontrou o candidato para atualizar
                    c.setNome(candidato.getNome());
                    c.setCidade(candidato.getCidade());
                    c.setEndereco(candidato.getEndereco());
                    c.setNiver(candidato.getNiver());
                    return "Candidato atualizado";
                }
            }
            return "Candidato não encontrado";
    }
}
