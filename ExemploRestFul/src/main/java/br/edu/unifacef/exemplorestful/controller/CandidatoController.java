package br.edu.unifacef.exemplorestful.controller;

import br.edu.unifacef.exemplorestful.model.Candidato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController// controlador Restful
@RequestMapping("/candidato")
public class CandidatoController {

    private List<Candidato> candidatos = new ArrayList<>();
    @GetMapping
    public String getCandidatos(){
        return "Retorna todos os candidatos cadastrados";
    }
    @PostMapping
    public String addCandidato(){
        return "Candidato cadastrado";
    }
}
