package br.com.unifacef.bdrestful.repository;

import br.com.unifacef.bdrestful.model.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormularioRepository extends
        JpaRepository<Formulario, Long> {

}
