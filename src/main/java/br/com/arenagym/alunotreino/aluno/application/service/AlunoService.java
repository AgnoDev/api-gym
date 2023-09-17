package br.com.arenagym.alunotreino.aluno.application.service;

import br.com.arenagym.alunotreino.aluno.application.api.AlunoListResponse;
import br.com.arenagym.alunotreino.aluno.application.api.AlunoRequest;
import br.com.arenagym.alunotreino.aluno.application.api.AlunoResponse;
import br.com.arenagym.alunotreino.aluno.application.api.AlunoResponseId;

import java.util.List;
import java.util.UUID;

public interface AlunoService {
    AlunoResponse postAluno(AlunoRequest alunoRequest);
    List<AlunoListResponse> getAllAluno();
    AlunoResponseId getAlunoById(UUID idAluno);
    void deleteAlunoById(UUID idAluno);
}
