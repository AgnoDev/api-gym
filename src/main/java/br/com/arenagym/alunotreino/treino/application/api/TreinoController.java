package br.com.arenagym.alunotreino.treino.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
public class TreinoController implements TreinoAPI {
    @Override
    public TreinoResponse postTreino(UUID idAluno, TreinoRequest treinoRequest) {
        log.info("[start] -> TreinoController -> postTreino");
        log.info("[idAluno] {}", idAluno);
        log.info("[finish] -> TreinoController -> postTreino");
        return null;
    }
}
