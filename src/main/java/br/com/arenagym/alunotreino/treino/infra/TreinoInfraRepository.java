package br.com.arenagym.alunotreino.treino.infra;

import br.com.arenagym.alunotreino.treino.application.service.TreinoRepository;
import br.com.arenagym.alunotreino.treino.domain.Treino;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class TreinoInfraRepository implements TreinoRepository {
    private final TreinoJPARepository treinoJPARepository;
    @Override
    public Treino postTreino(Treino treino) {
        log.info("[start] -> TreinoInfraRepository -> postTreino");
        treinoJPARepository.save(treino);
        log.info("[finish] -> TreinoInfraRepository -> postTreino");
        return treino;
    }
}
