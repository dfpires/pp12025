package br.com.unifacef.bdrestful.service;

import br.com.unifacef.bdrestful.model.Formulario;
import br.com.unifacef.bdrestful.repository.FormularioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormularioService {
    // injeção de dependência
    // formularioRepository pode ser usado sem instanciá-lo
    private FormularioRepository formularioRepository;
    // construtor
    public FormularioService(FormularioRepository formularioRepository) {
        this.formularioRepository = formularioRepository;
    }
    // seleção
    public List<Formulario> getFormularios(){
        return formularioRepository.findAll();
    }
    // inserção
    public Formulario addFormulario(Formulario formulario){
        return formularioRepository.save(formulario);
    }
}
