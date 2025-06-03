package br.com.unifacef.bdrestful.repository;

import br.com.unifacef.bdrestful.model.Dominio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DominioRepository extends
        JpaRepository<Dominio, Long> {

}
