package br.com.arenagym.alunotreino.treino.application.service;

import br.com.arenagym.alunotreino.treino.application.api.TreinoRequest;
import br.com.arenagym.alunotreino.treino.application.api.TreinoResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class TreinoApplicationService implements TreinoService {
    @Override
    public TreinoResponse postTreino(UUID idAluno, TreinoRequest treinoRequest) {
        log.info("[start] -> TreinoApplicationService -> postTreino");
        log.info("[idAluno] {}", idAluno);
       //] TreinoResponse treino = treinoService.postTreino(idAluno, treinoRequest);
        log.info("[finish] -> TreinoApplicationService -> postTreino");
        return null;
    }
}
