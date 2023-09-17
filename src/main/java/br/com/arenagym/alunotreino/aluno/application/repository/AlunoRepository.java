package br.com.arenagym.alunotreino.aluno.application.repository;

import br.com.arenagym.alunotreino.aluno.application.api.AlunoListResponse;
import br.com.arenagym.alunotreino.aluno.domain.Aluno;

import java.util.List;
import java.util.UUID;


public interface AlunoRepository {
    Aluno postAluno(Aluno aluno);
    List<Aluno> getAllAluno();
    Aluno getAlunoById(UUID idAluno);
}
