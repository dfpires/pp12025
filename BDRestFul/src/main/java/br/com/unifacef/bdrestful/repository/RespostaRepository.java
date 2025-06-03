package br.com.unifacef.bdrestful.repository;

import br.com.unifacef.bdrestful.model.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespostaRepository extends
        JpaRepository<Resposta, Integer> {

}
