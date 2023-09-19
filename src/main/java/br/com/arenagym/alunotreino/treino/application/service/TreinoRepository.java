package br.com.arenagym.alunotreino.treino.application.service;

import br.com.arenagym.alunotreino.treino.domain.Treino;

public interface TreinoRepository {
    Treino postTreino(Treino treino);
}
