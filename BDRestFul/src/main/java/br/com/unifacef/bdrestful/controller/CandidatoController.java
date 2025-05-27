package br.com.unifacef.bdrestful.controller;

import br.com.unifacef.bdrestful.model.Candidato;
import br.com.unifacef.bdrestful.service.CandidatoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {

    // cria um objeto da classe CandidatoService
    CandidatoService candidatoService;
    // construtor
    public CandidatoController(CandidatoService candidatoService) {
        this.candidatoService = candidatoService;
    }
    // método que consulta os candidatos no banco de dados
    @GetMapping
    public List<Candidato> listaTodos(){
        return candidatoService.listaCandidatos();
    }
    // método que adiciona um candidato no banco de dados
    @PostMapping
    public Candidato adicionaCandidato(@RequestBody Candidato candidato){
        return candidatoService.addCandidato(candidato);
    }
    // método que remove por id um candidato do banco de dados
    @DeleteMapping("/{id}")
    public String removeCandidato(@PathVariable Long id){
        return candidatoService.removeCandidato(id) ?
                 "Candidato removido com sucesso!" :
                 "Candidato não encontrado";
    }
}
