package br.com.unifacef.bdrestful.repository;

import br.com.unifacef.bdrestful.model.Questao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestaoRepository extends
        JpaRepository<Questao, Long> {

}
