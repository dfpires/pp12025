package br.com.unifacef.bdrestful.controller;

import br.com.unifacef.bdrestful.model.Candidato;
import br.com.unifacef.bdrestful.service.CandidatoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
