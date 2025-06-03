package br.com.unifacef.bdrestful.repository;

import br.com.unifacef.bdrestful.model.Questionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionarioRepository
        extends JpaRepository<Questionario, Long> {

}
