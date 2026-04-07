package br.com.senai.projeto.service;

import br.com.senai.projeto.model.Aluno;
import br.com.senai.projeto.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> listar() {
        return repository.findAll();
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
