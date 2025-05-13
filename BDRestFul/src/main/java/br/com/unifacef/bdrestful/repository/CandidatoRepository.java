package br.com.unifacef.bdrestful.repository;
// esta é uma classe especial, chamada classe interface
// na interface, todos os métodos são abstratos, portanto
// não são implementados aqui
import br.com.unifacef.bdrestful.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
// a interface herda de outra interface chamada JpaRepository
// o repositório do banco esta vinculado à tabela Candidato
// o tipo de dado da chave primária da tabela é Long
public interface CandidatoRepository extends
        JpaRepository<Candidato, Long> {
    // esta interface terá todos os métodos com a tabela
    // Candidato do banco de dados
    // ex: findAll (select), save (insert), remove (delete)
}
