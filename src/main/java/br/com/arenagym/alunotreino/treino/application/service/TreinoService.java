package br.com.arenagym.alunotreino.treino.application.service;


import br.com.arenagym.alunotreino.treino.application.api.*;

import java.util.List;
import java.util.UUID;

public interface TreinoService {
    TreinoResponse postTreino(UUID idAluno, TreinoRequest treinoRequest);
    List<TreinoListResponse> getTreinosDoAluno(UUID idAluno);
    TreinoResponseId getTreinoById(UUID idAluno, UUID idTreino);
    TreinoResponseId deleteTreinoById(UUID idAluno, UUID idTreino);
    void patchTreinoById(UUID idAluno, UUID idTreino, TreinoPatchRequest treinoPatchRequest);
}
