package br.com.unifacef.bdrestful.service;

import br.com.unifacef.bdrestful.model.Candidato;
import br.com.unifacef.bdrestful.repository.CandidatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // padrão de projeto esteriótipo
// essa classe tem as regras de negócio do backend
public class CandidatoService {
    // cria um objeto do tipo da interface CandidatoRepository
    CandidatoRepository candidatoRepository;
    // construtor com parâmetros
    CandidatoService(CandidatoRepository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }
    // lista todos os candidatos
    public List<Candidato> listaCandidatos(){
        // select * from candidato
        return candidatoRepository.findAll();
    }
    // insere um candidato
    public Candidato addCandidato(Candidato candidato){
        return candidatoRepository.save(candidato);
    }
    // remove um candidato
    public boolean removeCandidato(Long id){
        // verifica se o candidato existe
        if (candidatoRepository.existsById(id)){
            candidatoRepository.deleteById(id);
            return true;
        }
        return false;
    }
    // atualiza um candidato
    public Optional<Candidato> updateCandidato(Long id, Candidato novo){
        return candidatoRepository.findById(id).map(cand -> {
            cand.setNome(novo.getNome());
            cand.setCidade(novo.getCidade());
            cand.setEndereco(novo.getEndereco());
            cand.setNiver(novo.getNiver());
            return candidatoRepository.save(cand); // atualiza por cand tem id
        });
    }
}
