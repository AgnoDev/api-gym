package br.com.arenagym.alunotreino.treino.application.service;

import br.com.arenagym.alunotreino.treino.domain.Treino;

import java.util.List;
import java.util.UUID;

public interface TreinoRepository {
    Treino postTreino(Treino treino);
    List<Treino> getTreinosDoAluno(UUID idAluno);
    Treino getTreinoById(UUID idTreino);
}
