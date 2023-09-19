package br.com.arenagym.alunotreino.treino.application.service;


import br.com.arenagym.alunotreino.treino.application.api.TreinoRequest;
import br.com.arenagym.alunotreino.treino.application.api.TreinoResponse;

import java.util.UUID;

public interface TreinoService {
    TreinoResponse postTreino(UUID idAluno, TreinoRequest treinoRequest);
}
