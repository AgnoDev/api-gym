package br.com.arenagym.alunotreino.aluno.application.service;

import br.com.arenagym.alunotreino.aluno.application.api.AlunoRequest;
import br.com.arenagym.alunotreino.aluno.application.api.AlunoResponse;

public interface AlunoService {
    AlunoResponse postAluno(AlunoRequest alunoRequest);
}
