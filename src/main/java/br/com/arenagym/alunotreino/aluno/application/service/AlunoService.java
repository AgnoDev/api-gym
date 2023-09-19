package br.com.arenagym.alunotreino.aluno.application.service;

import br.com.arenagym.alunotreino.aluno.application.api.*;

import java.util.List;
import java.util.UUID;

public interface AlunoService {
    AlunoResponse postAluno(AlunoRequest alunoRequest);
    List<AlunoListResponse> getAllAluno();
    AlunoResponseId getAlunoById(UUID idAluno);
    void deleteAlunoById(UUID idAluno);
    void patchAluno(UUID idAluno, AlunoPatchRequest alunoPatchRequest);
}
