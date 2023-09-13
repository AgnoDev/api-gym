package br.com.arenagym.alunotreino.aluno.application.service;

import br.com.arenagym.alunotreino.aluno.application.api.AlunoListResponse;
import br.com.arenagym.alunotreino.aluno.application.api.AlunoRequest;
import br.com.arenagym.alunotreino.aluno.application.api.AlunoResponse;

import java.util.List;

public interface AlunoService {
    AlunoResponse postAluno(AlunoRequest alunoRequest);
    List<AlunoListResponse> getAllAluno();
}
