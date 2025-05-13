package br.com.unifacef.bdrestful.service;

import br.com.unifacef.bdrestful.model.Candidato;
import br.com.unifacef.bdrestful.repository.CandidatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // padrão de projeto esteriótipo
// essa classe tem as regras de negócio do backend
public class CandidatoService {
    // cria um objeto do tipo da interface CandidatoRepository
    CandidatoRepository candidatoRepository;
    // construtor com parâmetros
    CandidatoService(CandidatoRepository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }

    public List<Candidato> listaCandidatos(){
        // select * from candidato
        return candidatoRepository.findAll();
    }
}
