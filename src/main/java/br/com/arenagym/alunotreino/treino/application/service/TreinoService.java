package br.com.arenagym.alunotreino.treino.application.service;


import br.com.arenagym.alunotreino.treino.application.api.TreinoListResponse;
import br.com.arenagym.alunotreino.treino.application.api.TreinoRequest;
import br.com.arenagym.alunotreino.treino.application.api.TreinoResponse;
import br.com.arenagym.alunotreino.treino.application.api.TreinoResponseId;

import java.util.List;
import java.util.UUID;

public interface TreinoService {
    TreinoResponse postTreino(UUID idAluno, TreinoRequest treinoRequest);
    List<TreinoListResponse> getTreinosDoAluno(UUID idAluno);
    TreinoResponseId getTreinoById(UUID idAluno, UUID idTreino);
}
