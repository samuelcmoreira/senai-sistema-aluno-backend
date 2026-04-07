package br.com.senai.projeto.repository;

import br.com.senai.projeto.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
